package dataAccess;

import Model.Event;

import java.util.ArrayList;
/**
 * This class is full of methods key to manipulating the sql database and
 * the model objects of the type Event
 */
public class EventDao {
    /**
     * This adds an event into the SQL database
     * @param myEvent the token to be added
     * @return true or false based on whether it failed or not
     */
    public boolean AddEvent(Event myEvent) {
        //add Event to SQL db and returns true if successful
        return false;
    }
    /**
     * This finds an Event object and returns the object
     * @param myEventID the token to be queried
     * @return the Event object found, if not found null is returned
     */
    public Event QueryEvent(String myEventID) {
        //Check if unique eventID is found and return the event if found
        return null;
    }
    /**
     * Deletes an event from the database
     * @param myEventID the token to be deleted
     * @return true or false based on whether it is successful or not
     */
    public boolean DeleteEvent(String myEventID) {
        //Search for unique eventID and delete, return true if found, if not return false
        return false;
    }
    /**
     * Clears the database and Model objects that are of the type Event
     * @return true or false based on whether it is successful or not
     */
    public boolean ClearTable() {
        //go through all entries in sql database and clear delete all
        return false;
    }

    /**
     * This returns all events from all family members of the user
     * @param userName the userName to which the family members' events will be searched for
     * @return an ArrayList of Event objects that contain all events
     */
    public ArrayList<Event> ReturnAllEvents(String userName) {
        //run userDao.returnallfamilymembers function to get family members and get their events
        return null;
    }
}
