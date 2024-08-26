package fr.aimcvent.kernel.api.configuration;

public interface Denormalizers {

    <T, V> Denormalizer<T, V> of(Class<? extends Denormalizer<T, V>> clazz);
}
