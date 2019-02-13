package Services;

import Requests.FillRequest;
import Result.FillResult;
/**
 * This service executes all Daos required to do Event
 */
public class FillService {
    /**
     * This generates random people with 4 generations
     * @param userName the request body
     * @return response body
     */
    public FillResult fill(String userName) {
        //query userName and check that it is in the database
        //call the clear request on the userName
        //for loop running personDao.addperson 4 times which is the default
        return null;
    }
    /**
     * This generates random people with numGenerations
     * @param userName the user to which the new generations will be applied
     * @param numGenerations the number of generations to be made
     * @return response body
     */
    public FillResult fill(String userName, Integer numGenerations) {
        //query userName and check that it is in the database
        //call the clear request on the userName
        //check that numGenerations is a non negative integer
        //for loop running personDao.addperson numGenerations times
        return null;
    }
}
