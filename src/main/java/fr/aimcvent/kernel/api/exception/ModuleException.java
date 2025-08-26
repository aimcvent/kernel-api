package fr.aimcvent.kernel.api.exception;

/**
 * This exception is lifted in case of an error in the fitting of the injector.
 */
public class ModuleException extends RuntimeException
{
    public ModuleException() {
        super();
    }

    public ModuleException(String message) {
        super(message);
    }

    public ModuleException(Throwable cause) {
        super(cause);
    }

    public ModuleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModuleException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
