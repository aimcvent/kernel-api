package fr.aimcvent.kernel.api.logger;

public interface Logger {

    String name();

    void info(String message);

    void warn(String message);

    void debug(String message);

    void debug(String message, boolean finest);

    void error(String message);

    void error(String message, Throwable throwable);

    void trace(String message);

    void config(String message);
}
