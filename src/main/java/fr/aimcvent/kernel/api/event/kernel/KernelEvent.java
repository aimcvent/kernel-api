package fr.aimcvent.kernel.api.event.kernel;

import fr.aimcvent.kernel.api.Kernel;
import fr.aimcvent.kernel.api.event.Event;

/**
 * Kernel related event
 */
public abstract class KernelEvent implements Event {
    private final Kernel kernel;

    protected KernelEvent(Kernel kernel) {
        this.kernel = kernel;
    }

    public Kernel kernel() {
        return this.kernel;
    }
}
