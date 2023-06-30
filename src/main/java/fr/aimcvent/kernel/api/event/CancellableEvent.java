package fr.aimcvent.kernel.api.event;

/**
 * Used to create cancellable events within the application .
 */
public interface CancellableEvent extends Event {
    boolean cancelled();

    void cancelled(boolean cancelled);
}
