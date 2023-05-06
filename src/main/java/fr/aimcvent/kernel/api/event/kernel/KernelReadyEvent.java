package fr.aimcvent.kernel.api.event.kernel;

import fr.aimcvent.kernel.api.Kernel;

/**
 * Event launched when the kernel is ready.
 */
public class KernelReadyEvent extends KernelEvent {
    public KernelReadyEvent(Kernel kernel) {
        super(kernel);
    }
}
