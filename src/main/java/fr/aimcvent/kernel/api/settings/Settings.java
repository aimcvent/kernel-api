package fr.aimcvent.kernel.api.settings;

public interface Settings {
    <T> Setting<T> of(String key, T def);

    <T extends Number> NumericSetting<T> numericOf(String key, T def, Class<T> type);
}
