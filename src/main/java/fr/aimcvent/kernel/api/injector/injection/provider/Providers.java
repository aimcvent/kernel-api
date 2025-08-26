package fr.aimcvent.kernel.api.injector.injection.provider;

import java.util.List;

public interface Providers {
    List<Provider<?>> all();

    <T> boolean has(Class<T> clazz);

    <T> Provider<T> of(Class<T> clazz);

    <T> Providers register(Provider<T> provider);

    <T> Providers register(Class<T> clazz, T instance);
}
