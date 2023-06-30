package fr.aimcvent.kernel.api.service;

import java.util.List;

/**
 * Service manager to contain all the services offered by the application.
 */
public interface Services {
    /**
     * Allows you to retrieve the list of services registered.
     * @return service collection
     */
    List<Service> all();

    /**
     * Used to indicate if the service exists.
     * @param clazz The service checked
     * @return if service exist or not.
     */
    boolean has(Class<? extends Service> clazz);

    /**
     * Allows you to retrieve a service specific.
     * @param clazz Key of service requested
     * @return service
     * @param <T> key of service type
     */
    <T extends Service> T of(Class<T> clazz);

    ServiceLoader loader();
}
