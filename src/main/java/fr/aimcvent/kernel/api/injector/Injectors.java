package fr.aimcvent.kernel.api.injector;


import fr.aimcvent.kernel.api.exception.InjectorInvalidClassException;
import fr.aimcvent.kernel.api.utils.Accessor;
import fr.aimcvent.kernel.api.utils.BiAccessor;

/**
 * The injector allows to load a series of classes into a package based on the adapters and parameters it knows.
 */
public interface Injectors {
    /**
     * List of registered adapters.
     * @return Adapters list.
     */
    BiAccessor<Class<?>, InjectorAdapter<?>> adapters();

    /**
     * List of parameters that can be used when creating instances.
     * @return Parameters list.
     */
    BiAccessor<Class<?>, Object> parameters();

    /**
     * List of packages to exclude
     * @return Packages excluded list.
     */
    Accessor<String> excludes();

    /**
     * Launch injection from a package with a depth.
     * @param _package Injector target package
     * @param depth Depth to which the injector can go
     * @return injectors
     */
    Injectors inject(String _package, int depth);

    /**
     * Launch injection from a package with an adaptor key.
     * @param _package Injector target package
     * @param clazz Adaptor key
     * @return injectors
     */
    Injectors inject(String _package, Class<?> clazz);

    /**
     * Launch injection from a package with a depth and adaptor key.
     * @param _package Injector target package
     * @param depth Depth to which the injector can go
     * @param clazz Adaptor key
     * @return injectors
     */
    Injectors inject(String _package, int depth, Class<?> clazz);

    /**
     * Launch injection from a multiple packages.
     * @param packages Injector target packages
     * @return injectors
     */
    Injectors inject(String... packages);

    /**
     * Launch injection from a multiple packages with a depth.
     * @param packages Injector target packages
     * @param depth Depth to which the injector can go
     * @return injectors
     */
    Injectors inject(String[] packages, int depth);

    /**
     * Launch injection from a multiple packages with an adaptor key.
     * @param packages Injector target packages
     * @param clazz Adaptor key
     * @return injectors
     */
    Injectors inject(String[] packages, Class<?> clazz);

    /**
     * Launch injection from a multiple packages with a depth and adaptor key.
     * @param packages Injector target packages
     * @param depth Depth to which the injector can go
     * @param clazz Adaptor key
     * @return injectors
     */
    Injectors inject(String[] packages, int depth, Class<?> clazz);

    <T> T create(Class<T> clazz, Object... params) throws InjectorInvalidClassException;
}
