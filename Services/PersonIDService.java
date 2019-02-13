package Services;

import Requests.PersonIDRequest;
import Result.PersonIDResult;
/**
 * This service executes all Daos required to do PersonID
 */
public class PersonIDService {
    /**
     * This gets the Person object through a provided PersonID
     * @param personIDRequest the request body
     * @return response body
     */
    public PersonIDResult personID(PersonIDRequest personIDRequest) {
        //call authtokentao.CorrectToken() function to see if token matches with db and userName
        //call the function from personDao that queries for person with param personID, will return person object
        return null;
    }
}
