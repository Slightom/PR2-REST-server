package service;

import java.net.URI;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Flight;
import model.Ticket;
import resource.FlightResource;
import resource.TicketResource;


@Path("tickets")
public class TicketsService {

    TicketResource ticketResource = new TicketResource();
    //@Context
    //private UriInfo context;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Ticket> getText(@QueryParam("size") Long size) {
        return ticketResource.getTickets();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{firstName}/{lastName}")
    public List<Ticket> getTicketsByPerson(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
        return ticketResource.getTickets(firstName, lastName);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Ticket createTicket(Ticket ticket) {
        System.out.println("jestem w poscie: " + ticket.toString());
        
        Ticket newTicket = ticketResource.createTicket(ticket);
        //String newId = String.valueOf(newTicket.getId());
        //URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
        //Response response = Response.created(uri).entity(newTicket).build();

        return newTicket;
    }

    
    @DELETE
    @Path("/{ticketId}")
    public Ticket delete(@PathParam("ticketId") Long id) {
        System.out.println("tservice: delete");
        return ticketResource.deleteTicket(id);
    }
}