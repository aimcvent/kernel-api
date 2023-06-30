package fr.aimcvent.kernel.api.exception;

public class KernelEventException extends RuntimeException {
    public KernelEventException() {
        super();
    }

    public KernelEventException(String message) {
        super(message);
    }

    public KernelEventException(Throwable cause) {
        super(cause);
    }

    public KernelEventException(String message, Throwable cause) {
        super(message, cause);
    }

    public KernelEventException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
