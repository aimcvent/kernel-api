package fr.aimcvent.kernel.api.injector.injection.adapter;

public interface ClassAdapter<T> extends Adapter<T> {
    void accept(Class<? extends T> clazz);
}
