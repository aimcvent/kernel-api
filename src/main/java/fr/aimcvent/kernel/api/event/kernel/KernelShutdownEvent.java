package fr.aimcvent.kernel.api.event.kernel;

import fr.aimcvent.kernel.api.Kernel;

public class KernelShutdownEvent extends KernelEvent {
    public KernelShutdownEvent(Kernel kernel) {
        super(kernel);
    }
}
