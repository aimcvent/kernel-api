package fr.aimcvent.kernel.api.settings;

import fr.aimcvent.kernel.api.configuration.Denormalizer;

public interface Settings {
    <T> Setting<T> of(String key, T def);

    <T, V> Setting<T> of(Class<? extends Denormalizer<T, V>> clazz, String key, T def);

    <T extends Number> NumericSetting<T> numericOf(String key, T def, Class<T> type);
}
