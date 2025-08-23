package fr.aimcvent.kernel.api.injector.injection;

import fr.aimcvent.kernel.api.injector.configuration.Configuration;

import java.util.List;

public interface Injectors {
    List<Injector> all();

    Injector of(String name);

    Injector create(Configuration configuration);

    Injector def();
}
