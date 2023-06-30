package fr.aimcvent.kernel.api.event.service;

import fr.aimcvent.kernel.api.service.Service;

/**
 * Event allowing to launch the initialization of a service
 */
public class InitServiceEvent extends ServiceEvent {
    public InitServiceEvent(Service service) {
        super(service);
    }
}
