package UniCampus;

public class UniException extends Exception {

    public UniException() {
        super();
    }

    public UniException(String message) {
        super(message);
    }

    public UniException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniException(Throwable cause) {
        super(cause);
    }
}
