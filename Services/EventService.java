package Services;

import Requests.EventRequest;
import Result.EventResult;
/**
 * This service executes all Daos required to do Event
 */
public class EventService {
    /**
     * This gets the events of all family members of a user
     * @param eventRequest the request body
     * @return response body
     */
    EventResult event(EventRequest eventRequest) {
        //check authToken
        //run eventModel function to return an arraylist of events
        return null;
    }
}
