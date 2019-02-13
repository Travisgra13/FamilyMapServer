package Result;

import Model.Event;
/**
 * Holds the response body for EventID
 */
public class EventIDResult {
    /**
     * the data member associated with EventID response body
     */
    private Event myEvent;
    private boolean successful;

    public EventIDResult(Event myEvent, boolean successful) {
        this.myEvent = myEvent;
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
