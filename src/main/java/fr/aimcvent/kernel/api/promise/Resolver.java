package fr.aimcvent.kernel.api.promise;

@FunctionalInterface
public interface Resolver<T>
{
    void resolve(Fulfillment<T> fulfillment);
}
