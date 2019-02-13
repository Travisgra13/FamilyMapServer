package Requests;

import Model.Event;
import Model.Person;
import Model.User;

/**
 * Holds the request body for Load
 */

public class LoadRequest {
    /**
     * the data members associated with Load body
     */
    private User[] myUsers;
    private Person[] myPersons;
    private Event[] myEvents;

    public LoadRequest(User[] myUsers, Person[] myPersons, Event[] myEvents) {
        this.myUsers = myUsers;
        this.myPersons = myPersons;
        this.myEvents = myEvents;
    }

    public void setMyUsers(User[] myUsers) {
        this.myUsers = myUsers;
    }

    public void setMyPersons(Person[] myPersons) {
        this.myPersons = myPersons;
    }

    public void setMyEvents(Event[] myEvents) {
        this.myEvents = myEvents;
    }

    public User[] getMyUsers() {
        return myUsers;
    }

    public Person[] getMyPersons() {
        return myPersons;
    }

    public Event[] getMyEvents() {
        return myEvents;
    }
}
