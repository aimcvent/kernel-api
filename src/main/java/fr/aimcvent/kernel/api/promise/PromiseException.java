package fr.aimcvent.kernel.api.promise;

public class PromiseException extends RuntimeException
{
    public PromiseException() {
        super();
    }

    public PromiseException(String message) {
        super(message);
    }

    public PromiseException(Throwable cause) {
        super(cause);
    }

    public PromiseException(String message, Throwable cause) {
        super(message, cause);
    }

    public PromiseException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
