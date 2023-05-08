package fr.aimcvent.kernel.api;

import fr.aimcvent.kernel.api.configuration.Configurations;
import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.event.Events;
import fr.aimcvent.kernel.api.injector.Injectors;
import fr.aimcvent.kernel.api.logger.Loggers;
import fr.aimcvent.kernel.api.promise.Promises;
import fr.aimcvent.kernel.api.service.Services;
import fr.aimcvent.kernel.api.translation.Translations;
import fr.aimcvent.kernel.api.utils.Environment;
import fr.aimcvent.kernel.api.utils.Identifier;

import java.util.logging.Logger;

public interface Kernel extends WithConfiguration {
    Identifier identifier();

    Loggers loggers();
    /**
     * Allows you to retrieve the kernel logger.
     * @return logger
     */
    Logger logger();

    /**
     * Allows you to retrieve the application environment. (PROD or DEV)
     * @return env
     */
    Environment env();

    /**
     * Allows you to retrieve the service manager.
     * @return services
     */
    Services services();

    /**
     * Allows you to retrieve the injector manager.
     * @return injectors
     */
    Injectors injectors();

    /**
     * Allows you to retrieve the events manager.
     * @return events
     */
    Events events();

    Promises promises();

    /**
     * Allow you to retrieve the configuration manager.
     * @return configurations
     */
    Configurations configurations();

    Translations translations();

    void shutdown();
}
