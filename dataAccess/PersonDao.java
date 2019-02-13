package dataAccess;

import Model.Person;
/**
 * This class is full of methods key to manipulating the sql database and
 * the model objects of the type Person
 */
public class PersonDao {
    /**
     * This adds a person into the SQL database
     * @param myPerson the person to be added
     * @return true or false based on whether it failed or not
     */
    public boolean AddPerson(Person myPerson) {
        //add person to SQL db and returns true if successful
        return false;
    }
    /**
     * This finds a person object and returns the object
     * @param myPersonID the person to be queried
     * @return the Person object found, if not found null is returned
     */
    public Person QueryPerson(String myPersonID) {
        //Check if unique personID is found and return the person if found
        return null;
    }
    /**
     * Deletes a person from the database
     * @param myPersonID the person to be deleted
     * @return true or false based on whether it is successful or not
     */
    public boolean DeletePerson(String myPersonID) {
        //Search for unique personID and delete, return true if found, if not return false
        return false;
    }
    /**
     * Clears the database and Model objects that are of the type Person
     * @return true or false based on whether it is successful or not
     */
    public boolean ClearTable() {
        //go through all entries in sql database and clear delete all
        return false;
    }
}
