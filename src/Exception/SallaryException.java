package Exception;

public class SallaryException extends Exception {
    public SallaryException() {
    }

    public SallaryException(String message) {
        super(message);
    }

    public SallaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public SallaryException(Throwable cause) {
        super(cause);
    }

    public SallaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

