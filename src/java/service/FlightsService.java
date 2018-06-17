package service;

import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.Flight;
import resource.FlightResource;


@Path("flights")
public class FlightsService {

    FlightResource flightResource = new FlightResource();
    @Context
    private UriInfo context;


    public FlightsService() {
    }
    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Flight> getText(@QueryParam("size") Long size) {

        return flightResource.getFlights();
    }

    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
