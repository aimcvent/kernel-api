package fr.aimcvent.kernel.api.configuration;

import com.google.gson.Gson;
import fr.aimcvent.kernel.api.service.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.function.Supplier;

public interface Configurations {

    Gson gson();

    Configurations register(Class<?> clazz, Object adapter);

    Configurations register(Class<?> clazz, Object adapter, boolean hierarchy);

    <T> Configurations register(Class<T> implementation, Class<? extends T> clazz);
    <T> Configurations register(Class<T> implementation, Class<? extends T> clazz, boolean hierarchy);

    Configuration load(String path);

    Configuration load(File file);

    Configuration load(Reader reader);

    Configuration load(Service service) throws Exception;

    Configuration load(Service service, boolean reload) throws Exception;

    <T> T load(Class<T> clazz, String path) throws FileNotFoundException;

    <T> T load(Class<T> clazz, File file) throws FileNotFoundException;

    <T> T load(Class<T> clazz, Reader reader);

    <T> T load(Class<T> clazz, String path, Supplier<T> def);

    <T> T load(Class<T> clazz, File file, Supplier<T> def);

    <T> T load(Class<T> clazz, Reader reader, Supplier<T> def);

    void save(Object object, String path) throws IOException;

    void save(Object object, File file) throws IOException;
}
