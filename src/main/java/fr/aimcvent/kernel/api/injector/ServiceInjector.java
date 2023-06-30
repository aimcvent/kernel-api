package fr.aimcvent.kernel.api.injector;

import fr.aimcvent.kernel.api.service.Service;

import java.lang.annotation.*;

/**
 * Used to indicate that the service class can be handled by the injector.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ServiceInjector {
    /**
     * Class to be used as a key in an adapter.
     * @return clazz
     */
    Class<? extends Service> clazz();

    String config() default "config.json";
}
