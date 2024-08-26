package fr.aimcvent.kernel.api.configuration;

import java.util.Map;

public interface Denormalizer<T, V> {
    T denormalize(V value);
}
