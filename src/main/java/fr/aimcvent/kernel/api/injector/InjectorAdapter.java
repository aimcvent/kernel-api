package fr.aimcvent.kernel.api.injector;

import fr.aimcvent.kernel.api.exception.InjectorAdapterException;

/**
 * The adapter injector gives an indication of how to use the class that has just been created.
 * @param <T> The instance created
 */
public interface InjectorAdapter<T> {
    /**
     * Call through the injector to determine what to do with the created instance.
     * @param object Instance created
     * @throws InjectorAdapterException Exception lifted on error
     */
    void accept(T object) throws InjectorAdapterException;
}
