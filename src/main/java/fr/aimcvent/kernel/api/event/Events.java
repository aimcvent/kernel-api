package fr.aimcvent.kernel.api.event;

/**
 * The event handler that contains all registered events and call them.
 */
public interface Events {
    /**
     * Allows to execute an event within the application.
     * @param event Event to call.
     * @return event
     * @param <T> Event type
     */
    <T extends Event> T call(T event);

    /**
     * Allows you to register a series of events found in an instance.
     * @param listener The instance that contains one or more events
     */
    void register(Object listener);

    /**
     * Allows you to unregister a series of events found in an instance.
     * @param listener The instance that contains one or more events
     */
    void unregister(Object listener);
}
