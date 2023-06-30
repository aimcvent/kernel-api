package fr.aimcvent.kernel.api.event.service;

import fr.aimcvent.kernel.api.event.Event;
import fr.aimcvent.kernel.api.service.Service;

/**
 * Service related event
 */
public abstract class ServiceEvent implements Event {
    private final Service service;

    protected ServiceEvent(Service service) {
        this.service = service;
    }

    public Service service() {
        return this.service;
    }
}
