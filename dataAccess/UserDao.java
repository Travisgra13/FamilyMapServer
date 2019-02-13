package dataAccess;

import Model.Person;
import Model.User;

import java.util.ArrayList;
/**
 * This class is full of methods key to manipulating the sql database and
 * the model objects of the type User
 */
public class UserDao {
    //private User myUser;
    //private User origUser;
    /**
     * This adds a user into the SQL database
     * @param myUser the user to be added
     * @return true or false based on whether it failed or not
     */
    public boolean AddUser(User myUser) {
        //add User to SQL db and returns true if successful
        return false;
    }
    /**
     * This finds a User object and returns the object
     * @param myUserName the user to be queried
     * @return the User object found, if not found null is returned
     */

    public User QueryUser(String myUserName) {
        //Check if unique userName is found and return the user if found
        return null;
    }
    /**
     * Deletes a User from the database
     * @param myUserName the User to be deleted
     * @return true or false based on whether it is successful or not
     */
    public boolean DeleteUser(String myUserName) {
        //Search for unique userName and delete, return true if found, if not return false
        return false;
    }
    /**
     * Clears the database and Model objects that are of the type User
     * @return true or false based on whether it is successful or not
     */
    public boolean ClearTable() {
        //go through all entries in sql database and clear delete all
        return false;
    }
    /**
     * This returns all people from all family members of the user
     * @param userName the userName to which the family members will be searched for
     * @return an ArrayList of Person objects that contain all events
     */
    public ArrayList<Person> ReturnAllFamilyMembers(String userName) {
        //use SELECT through and find all people
        return null;
    }

}
