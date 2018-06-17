package resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Ticket;

public class TicketResource {

    static private Map<Long, Ticket> tickets = new HashMap<Long, Ticket>();

    public TicketResource() {
        if (tickets.isEmpty()) {
            tickets.put(1L, new Ticket(1, "Warszawa", "Lizbona", "2018-7-7, 14:00", "2018-7-7, 18:00", "Tomasz", "Suchwałko", 1));
            tickets.put(2L, new Ticket(2, "Warszawa", "Kraków", "2018-7-9, 12:00", "2018-7-9, 14:00", "Tomasz", "Suchwałko", 2));
            tickets.put(3L, new Ticket(3, "Warszawa", "Kraków", "2018-7-14, 12:00", "2018-7-14, 14:00", "Tomasz", "Suchwałko", 7));
            tickets.put(4L, new Ticket(4, "Amsterdam", "Londyn", "2018-7-11, 11:00", "2018-7-11, 15:00", "Tomasz", "Suchwałko", 4));
            tickets.put(5L, new Ticket(5, "Amsterdam", "Londyn", "2018-7-11, 11:00", "2018-7-11, 15:00", "Romek", "Kowalski", 4));
            tickets.put(6L, new Ticket(6, "Warszawa", "Lizbona", "2018-7-7, 14:00", "2018-7-7, 18:00", "Romek", "Kowalski", 1));
        }
    }

    public static List<Ticket> getTickets() {
        return new ArrayList<Ticket>(tickets.values());
    }

    public Ticket createTicket(Ticket ticket) {
        System.out.println("jestem w create: " + ticket.toString());
        ticket.setId(generateId());
        tickets.put(ticket.getId(), ticket);

        return tickets.get(ticket.getId());
    }

    private int generateId() {
        return tickets.size() + 1;
    }

    public Ticket deleteTicket(Long id) {
        System.out.println("tresource: deleteTicket");
        Ticket t = tickets.get(id);
        tickets.remove(id);
        return t;
    }

    public List<Ticket> getTickets(String firstName, String lastName) {
        List<Ticket> list = new ArrayList<>();

        for (Object value : tickets.values()) {
            Ticket t = (Ticket) value;
            if (t.getFirstName().equals(firstName) && t.getLastName().equals(lastName)) {
                list.add(t);
            }
        }
        
        return list;
    }
}
