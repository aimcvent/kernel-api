package fr.aimcvent.kernel.api.configuration;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public interface Configuration {
    Set<String> keys();

    List<Object> values();

    boolean has(String key);

    <T> T get(String key);

    <T, V> T get(Class<?  extends Denormalizer<T, V>> clazz, String key);

    <T> List<T> getList(String key);

    <T, V> List<T> getList(Class<? extends Denormalizer<T, V>> clazz, String key);

    <T> Map<String, T> getMap(String key);

    <T, V> Map<String, T> getMap(Class<? extends Denormalizer<T, V>> clazz, String key);

    <T extends Number> T getNumber(String key, Class<T> type);

    <T extends Number> T getNumber(String key, T def, Class<T> type);

    <T> T get(String key, T def);

    <T, V> T get(Class<?  extends Denormalizer<T, V>> clazz, String key, T def);

    <T> List<T> getList(String key, Supplier<List<T>> def);

    <T, V> List<T> getList(Class<? extends Denormalizer<T, V>> clazz, String key, Supplier<List<T>> def);

    <T> Map<String, T> getMap(String key, Supplier<Map<String, T>> def);

    <T, V> Map<String, T> getMap(Class<? extends Denormalizer<T, V>> clazz, String key, Supplier<Map<String, T>> def);

    <T> T getOrSet(String key, T def);

    Configuration set(String key, Object object);

    void save() throws IOException;
}
