package fr.aimcvent.kernel.api.promise;

public interface Fulfillment<T>
{
    boolean isAsync();
    void accept(T type);

    void reject(Throwable throwable);
}
