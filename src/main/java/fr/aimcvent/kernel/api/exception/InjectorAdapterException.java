package fr.aimcvent.kernel.api.exception;

/**
 * This exception is lifted in case of an error in the fitting of the injector.
 */
public class InjectorAdapterException extends RuntimeException
{
    public InjectorAdapterException() {
        super();
    }

    public InjectorAdapterException(String message) {
        super(message);
    }

    public InjectorAdapterException(Throwable cause) {
        super(cause);
    }

    public InjectorAdapterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InjectorAdapterException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
