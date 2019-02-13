package Result;

import Model.Person;

import java.util.ArrayList;
/**
 * Holds the response body for Person
 */
public class PersonResult {
    /**
     * the data member associated with Person response body
     */
    private ArrayList<Person> familyMembers;
    private boolean successful;

    public PersonResult(ArrayList<Person> familyMembers, boolean successful) {
        this.familyMembers = familyMembers;
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
