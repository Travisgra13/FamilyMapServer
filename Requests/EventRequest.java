package Requests;

import Model.Event;

import java.util.ArrayList;

/**
 * Holds the request body for Event
 */
public class EventRequest {
    /**
     * the data member associated with Event body
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public EventRequest(String userName) {
        this.userName = userName;
    }

}
