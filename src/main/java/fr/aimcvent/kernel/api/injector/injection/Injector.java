package fr.aimcvent.kernel.api.injector.injection;

import fr.aimcvent.kernel.api.injector.InjectorService;
import fr.aimcvent.kernel.api.injector.configuration.Configuration;
import fr.aimcvent.kernel.api.injector.injection.adapter.Adapters;
import fr.aimcvent.kernel.api.injector.injection.provider.Providers;
import fr.aimcvent.kernel.api.injector.injection.scanner.Scanner;

public interface Injector {
    InjectorService service();

    Configuration configuration();

    Cache cache();

    Providers providers();

    Adapters adapters();

    Scanner scanner();

    <T> T create(Class<T> clazz, Object... params);
}
