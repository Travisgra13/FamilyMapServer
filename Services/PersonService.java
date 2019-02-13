package Services;

import Requests.PersonRequest;
import Result.PersonResult;
/**
 * This service executes all Daos required to do Person
 */
public class PersonService {
    /**
     * This gets all the family members of the user
     * @param personRequest the request body
     * @return response body
     */
    public PersonResult person(PersonRequest personRequest) {
        //Check auth token
    //Goes to PersonDao to run select through the descendants connected
        return null;
    }
}
