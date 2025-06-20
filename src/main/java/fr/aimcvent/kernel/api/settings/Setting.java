package fr.aimcvent.kernel.api.settings;

import java.util.function.Consumer;

public interface Setting<T> {
    String key();

    T of();

    void set(T value);

    void reset();

    void subscribe(Consumer<T> consumer);
}
