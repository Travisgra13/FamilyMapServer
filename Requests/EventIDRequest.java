package Requests;

/**
 * Holds the request body for Event
 */
public class EventIDRequest {
    /**
     * the eventID associated with the request
     */
    private String eventID;

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public EventIDRequest(String eventID) {
        this.eventID = eventID;
    }
}
