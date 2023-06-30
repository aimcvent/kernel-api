package fr.aimcvent.kernel.api.event.service;

import fr.aimcvent.kernel.api.service.Service;

/**
 * Event allowing to launch the post initialization of a service
 */
public class PostInitServiceEvent extends ServiceEvent {
    public PostInitServiceEvent(Service service) {
        super(service);
    }
}
