package Requests;

/**
 * Holds the request body for Fill
 */
public class FillRequest {
    /**
     * the data members associated with Fill body
     */
    private String userName;
    private Integer numGenerations;

    public FillRequest(String userName, Integer numGenerations) {
        this.userName = userName;
        this.numGenerations = null;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNumGenerations() {
        return numGenerations;
    }

    public void setNumGenerations(Integer numGenerations) {
        this.numGenerations = numGenerations;
    }
}
