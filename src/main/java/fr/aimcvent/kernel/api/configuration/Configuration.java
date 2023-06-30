package fr.aimcvent.kernel.api.configuration;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface Configuration {
    Set<String> keys();

    List<Object> values();

    boolean has(String key);

    <T> T get(String key);

    <T extends Number> T getNumber(String key, Class<T> type);

    <T> T get(String key, T def);

    <T> T getOrSet(String key, T def);

    Configuration set(String key, Object object);

    void save() throws IOException;
}
