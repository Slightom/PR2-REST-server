package model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
    private long id;
    private String cityFrom;
    private String cityTo;
    private String startingDate;
    private String landindDate;
    private String firstName;
    private String lastName;
    private long flightId;

    public Ticket() {
    }

    
    public Ticket(long id, String cityFrom, String cityTo, String startingDate, String landindDate, String firstName, String lastName, long flightId) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.startingDate = startingDate;
        this.landindDate = landindDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flightId = flightId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getLandindDate() {
        return landindDate;
    }

    public void setLandindDate(String landingDate) {
        this.landindDate = landingDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }
    
    
}
