package fr.aimcvent.kernel.api.logger;

import java.util.logging.Level;

public interface LoggerFactory {
    void setLevel(Level level);

    void log(Logger logger, Level level, String message, Throwable throwable);
}
