package Result;
/**
 * Holds the response body for Clear
 */
public class ClearResult {
    /**
     * the data member associated with Clear response body
     */
    private boolean successful;

    public ClearResult(boolean successful) {
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
