package Model;

/**
 * This class is the model class that holds the event information
 */
public class Event {
    /**
     * These variables are the sql equivalent of the rows/data
     */
    private String eventID;
    private Integer year;
    private String person;
    private String latitude;
    private String longitude;
    private String country;
    private String city;
    private String eventType;

    public Event(String eventID, Integer year) {
        this.eventID = eventID;
        this.year = year;

    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventID() {
        return eventID;
    }

    public Integer getYear() {
        return year;
    }
}
