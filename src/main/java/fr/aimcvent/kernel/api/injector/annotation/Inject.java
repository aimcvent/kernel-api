package fr.aimcvent.kernel.api.injector.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Inject {
    String value() default "";
}
