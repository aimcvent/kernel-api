package fr.aimcvent.kernel.api.settings;

public interface NumericSetting<T extends Number> extends Setting<T> {
    void add(T value);

    void remove(T value);

    void multiply(T value);

    void divide(T value);
}
