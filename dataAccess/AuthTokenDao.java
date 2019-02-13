package dataAccess;

import Model.AuthToken;

/**
 * This class is full of methods key to manipulating the sql database and
 * the model objects of the type AuthToken
 */
public class AuthTokenDao {
    /**
     * This adds an authorization token into the SQL database
     * @return true or false based on whether it failed or not
     */
    public boolean AddAuthToken() {
        //add authorization token to SQL db and returns true if successful
        return false;
    }

    /**
     * This validates whether the token is correct for the present user
     * @param myTokenKey the token to be inspected
     * @param userName the userName the token is to be checked in conjunction with the token
     * @return true or false based on whether it is successful or not
     */
    public boolean CorrectAuthToken(String myTokenKey, String userName) {
        //check if authToken matches with user
        return false;
    }

    /**
     * This finds a token and returns the AuthToken object
     * @param myTokenKey the token to be queried
     * @return the authToken found, if not found null is returned
     */
    public AuthToken QueryAuthToken(String myTokenKey) {
        //Check if unique token is found and return the token if found
        return null;
    }

    /**
     * Deletes an auth token from the database
     * @param myTokenKey the token to be deleted
     * @return true or false based on whether it is successful or not
     */
    public boolean DeleteAuthToken(String myTokenKey) {
        //Search for unique token and delete, return true if found, if not return false
        return false;
    }

    /**
     * Clears the database and Model objects that are of the type AuthToken
     * @return true or false based on whether it is successful or not
     */
    public boolean ClearTable() {
        //go through all entries in sql database and clear delete all
        return false;
    }

    /**
     * This generates a new random token for Add token function
     * @return the authToken that is randomly generated and return null if something went wrong
     */
    public AuthToken RandomlyGenerateToken() {
        //randomly generate token
        return null;
    }
}
