package fr.aimcvent.kernel.api.event;

/**
 * The larger the property, the more important the event will be considered and therefore executed last.
 */
public final class EventPriority {
    public static final int LOWEST  = 0;
    public static final int LOW     = 25;
    public static final int NORMAL  = 50;
    public static final int HIGH    = 75;
    public static final int HIGHEST = 100;
}
