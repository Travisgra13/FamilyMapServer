package Requests;
/**
 * Holds the request body for Person
 */
public class PersonRequest {
    /**
     * the data member associated with Person body
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PersonRequest(String userName) {
        this.userName = userName;
    }
}
