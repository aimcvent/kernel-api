package fr.aimcvent.kernel.api.injector.configuration;

import fr.aimcvent.kernel.api.injector.scope.Scope;

public interface Configuration {
    String name();

    Scope scope();

    boolean def();
}
