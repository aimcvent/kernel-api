package fr.aimcvent.kernel.api.injector;

import fr.aimcvent.kernel.api.injector.configuration.Configurations;
import fr.aimcvent.kernel.api.injector.injection.Injectors;
import fr.aimcvent.kernel.api.injector.scope.Scopes;

public interface InjectorService {
    Injectors injectors();

    Scopes scopes();

    Configurations configurations();
}
