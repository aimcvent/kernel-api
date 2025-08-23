package fr.aimcvent.kernel.api.utils;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Env {
    Environment[] value();
}
