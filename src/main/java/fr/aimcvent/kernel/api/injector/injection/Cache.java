package fr.aimcvent.kernel.api.injector.injection;

import java.util.function.Supplier;

public interface Cache {
    <T> T of(Class<T> clazz);

    <T> T of(Class<T> clazz, Supplier<T> factory);
}
