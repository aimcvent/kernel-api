package fr.aimcvent.kernel.api.settings;

public interface Setting<T> {
    String key();

    T of();

    void set(T value);

    void reset();
}
