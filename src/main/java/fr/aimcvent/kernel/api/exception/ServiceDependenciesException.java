package fr.aimcvent.kernel.api.exception;

public class ServiceDependenciesException extends RuntimeException {
    public ServiceDependenciesException() {
        super();
    }

    public ServiceDependenciesException(String message) {
        super(message);
    }

    public ServiceDependenciesException(Throwable cause) {
        super(cause);
    }

    public ServiceDependenciesException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceDependenciesException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
