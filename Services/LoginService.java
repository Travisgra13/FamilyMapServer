package Services;

import Requests.LoginRequest;
import Requests.RegisterRequest;
import Result.LoginResult;
import Result.RegisterResult;
/**
 * This service executes all Daos required to do Login
 */
public class LoginService {
    /**
     * This logins the user
     * @param loginRequest the request body
     * @return response body
     */
    public LoginResult login(LoginRequest loginRequest) {
       //Uses DaoFunctions such as query functions in userDao and personDao
       //if successful RETURNRESPONSE
        return null;
    }
}
