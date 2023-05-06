package fr.aimcvent.kernel.api.event.service;

import fr.aimcvent.kernel.api.service.Service;

/**
 * Event allowing to launch the unloading of a service
 */
public class ServiceShutdownEvent extends ServiceEvent {
    public ServiceShutdownEvent(Service service) {
        super(service);
    }
}
