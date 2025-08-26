package fr.aimcvent.kernel.api.injector.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Provider {
    Class<?> value();
}
