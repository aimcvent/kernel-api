package fr.aimcvent.kernel.api.injector.injection.adapter;

public interface ClassAdapter<T> extends Adapter<T> {
    void adapt(Class<? extends T> clazz);
}
