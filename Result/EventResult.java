package Result;

import Model.Event;

import java.util.ArrayList;
/**
 * Holds the response body for Event
 */
public class EventResult {
    /**
     * the data member associated with Event response body
     */
    private ArrayList<Event> events;
    private boolean successful;

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public EventResult(ArrayList<Event> events, boolean successful) {
        this.events = events;
        this.successful = successful;
    }
    /**
     * This returns the message associated with the result
     * @return
     */
    public String getMessage() {
        //check if successful and if so print out success message
        //if not return error message
        return null;
    }
}
