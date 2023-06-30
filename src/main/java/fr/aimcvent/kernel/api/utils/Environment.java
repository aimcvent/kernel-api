package fr.aimcvent.kernel.api.utils;

import java.util.logging.Level;

/**
 * Choice list of application environments
 */
public enum Environment {
    PROD (Level.INFO),
    DEV (Level.FINE),
    LOCAL (Level.ALL);

    private final Level level;

    Environment(Level level) {
        this.level = level;
    }

    /**
     * Allows you to retrieve the default level for init your loggers.
     * @return level
     */
    public Level level() {
        return this.level;
    }
}
