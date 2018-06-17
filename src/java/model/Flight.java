package model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Flight {
    private long id;
    private String cityFrom;
    private String cityTo;
    private String startingDate;
    private String landingDate;

    public Flight(long id, String cityFrom, String cityTo, String startingDate, String landingDate) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.startingDate = startingDate;
        this.landingDate = landingDate;
    }

    
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
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
        return landingDate;
    }

    public void setLandindDate(String landingDate) {
        this.landingDate = landingDate;
    }
    
    
}
