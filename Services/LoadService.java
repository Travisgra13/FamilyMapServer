package Services;

import Requests.LoadRequest;
import Result.LoadResult;
/**
 * This service executes all Daos required to do Load
 */
public class LoadService {
    /**
     * This loads information into the server
     * @param loadRequest the request body
     * @return response body
     */
    public LoadResult load(LoadRequest loadRequest) {
        //Calls the ClearService function to clear everything
        //Takes the arrays from the LoadRequest and puts it into the database
        return null;
    }
}
