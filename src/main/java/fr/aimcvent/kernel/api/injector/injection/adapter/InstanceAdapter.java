package fr.aimcvent.kernel.api.injector.injection.adapter;

public interface InstanceAdapter<T> extends Adapter<T>  {
    void adapt(T instance);
}
