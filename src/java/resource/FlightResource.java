package resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Flight;


public class FlightResource {
    static private Map<Long, Flight> flights = new HashMap<Long, Flight>();
    
    public FlightResource(){
        if (flights.isEmpty()) {
            flights.put(1L, new Flight(1L, "Warszawa", "Lizbona", "2018-7-7, 14:00", "2018-7-7, 18:00"));
            flights.put(2L, new Flight(2L, "Warszawa", "Kraków", "2018-7-9, 12:00", "2018-7-9, 14:00"));
            flights.put(3L, new Flight(3L, "Londyn", "Amsterdam", "2018-7-10, 12:00", "2018-7-10, 15:00"));
            flights.put(4L, new Flight(4L, "Amsterdam", "Londyn", "2018-7-11, 11:00", "2018-7-11, 15:00"));
            flights.put(5L, new Flight(5L, "Moskwa", "Warszawa", "2018-7-12, 20:00", "2018-7-12, 22:00"));
            flights.put(6L, new Flight(6L, "Warszawa", "Moskwa", "2018-7-13, 12:00", "2018-7-13, 14:00"));
            flights.put(7L, new Flight(7L, "Warszawa", "Kraków", "2018-7-14, 12:00", "2018-7-14, 14:00"));
        }
    }

    public static List<Flight> getFlights() {
        return new ArrayList<Flight>(flights.values());
    }   
}
