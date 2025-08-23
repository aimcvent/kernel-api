package fr.aimcvent.kernel.api.injector.scope;

import fr.aimcvent.kernel.api.injector.injection.Injector;
import fr.aimcvent.kernel.api.injector.injection.provider.Provider;

import java.lang.annotation.Annotation;

public interface Scope {
    String name();

    Class<? extends Annotation> annotation();

    <T> T of(Injector injector, Provider<T> provider);
}
