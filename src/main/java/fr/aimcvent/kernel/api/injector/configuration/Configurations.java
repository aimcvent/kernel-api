package fr.aimcvent.kernel.api.injector.configuration;

import fr.aimcvent.kernel.api.injector.scope.Scope;

import java.lang.annotation.Annotation;

public interface Configurations {
    Configuration of(String name, String scope, boolean def);

    Configuration of(String name, Class<? extends Annotation> scope, boolean def);

    Configuration of(String name, Scope scope, boolean def);
}
