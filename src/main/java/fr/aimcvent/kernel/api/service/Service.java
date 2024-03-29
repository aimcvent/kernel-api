package fr.aimcvent.kernel.api.service;

import fr.aimcvent.kernel.api.logger.Logger;

/**
 * A service is a module allowing to compartmentalize a predefined task.
 */
public interface Service {
    /**
     * Allows you to retrieve the service name.
     * @return name
     */
    String name();

    /**
     * Allows you to retrieve the service logger.
     * @return logger
     */
    Logger logger();

    /**
     * Allows you to retrieve the service dependencies.
     * @return dependencies
     */
    Class<? extends Service>[] dependencies();
}
