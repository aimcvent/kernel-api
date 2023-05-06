package fr.aimcvent.kernel.api.event.service;

import fr.aimcvent.kernel.api.service.Service;

/**
 * Event allowing to launch the pre initialization of a service
 */
public class PreInitServiceEvent extends ServiceEvent {
    public PreInitServiceEvent(Service service) {
        super(service);
    }
}
