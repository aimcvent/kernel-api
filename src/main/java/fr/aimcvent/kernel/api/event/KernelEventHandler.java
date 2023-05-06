package fr.aimcvent.kernel.api.event;

import fr.aimcvent.kernel.api.event.service.ServiceEvent;
import fr.aimcvent.kernel.api.service.Service;

import java.lang.annotation.*;

/**
 * Used to indicate that the kernel event method can be registered.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface KernelEventHandler {

    /**
     * Indicates whether the event should not be executed if it is cancelled.
     * @return ignore cancelled.
     */
    boolean ignoreCancelled() default false;

    /**
     * The larger the property, the more important the event will be considered and therefore executed last.
     * See {@link EventPriority}
     * @return priority value
     */
    int priority() default EventPriority.NORMAL;

    /**
     * Indicates that the event must be called only for a certain service (Warning, only works with {@link ServiceEvent})
     * @return service
     */
    Class<? extends Service> service() default Service.class;
}
