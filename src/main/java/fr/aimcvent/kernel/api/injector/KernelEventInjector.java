package fr.aimcvent.kernel.api.injector;

import java.lang.annotation.*;

/**
 * Used to indicate that the kernel event class can be handled by the injector.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface KernelEventInjector {
}
