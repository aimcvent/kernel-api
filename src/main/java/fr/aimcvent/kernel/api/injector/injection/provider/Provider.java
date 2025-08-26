package fr.aimcvent.kernel.api.injector.injection.provider;

public interface Provider<T> {
    Class<T> type();

    String packageType();

    Class<? extends T> implType();

    T of();
}
