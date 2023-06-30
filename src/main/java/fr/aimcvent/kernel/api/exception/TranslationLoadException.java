package fr.aimcvent.kernel.api.exception;

public class TranslationLoadException extends RuntimeException {
    public TranslationLoadException() {
        super();
    }

    public TranslationLoadException(String message) {
        super(message);
    }

    public TranslationLoadException(Throwable cause) {
        super(cause);
    }

    public TranslationLoadException(String message, Throwable cause) {
        super(message, cause);
    }

    public TranslationLoadException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
