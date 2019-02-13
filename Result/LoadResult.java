package Result;
/**
 * Holds the response body for Load
 */
public class LoadResult {
    /**
     * the data member associated with Load response body
     */
    private boolean successful;

    public LoadResult(boolean successful) {
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
