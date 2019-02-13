package Model;

/**
 * This is the authToken model class
 */
public class AuthToken {
    /**
     * contains a key and the user to which the key is assigned
     */
    private String key;
    private String user;

    public AuthToken(String key, String user) {
        this.key = key;
        this.user = user;
    }

    public String getKey() {
        return key;
    }

    public String getUser() {
        return user;
    }
}
