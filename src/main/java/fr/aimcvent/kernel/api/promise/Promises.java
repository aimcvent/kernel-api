package fr.aimcvent.kernel.api.promise;

public interface Promises
{
    <T> Promise<T> of(Resolver<T> resolver);

    Promise<Object[]> all(Promise<?>... promises);

    Promise<Settled<?>[]> allSettled(Promise<?>... promises);

    Promise<?> any(Promise<?>... promises);

    Promise<?> race(Promise<?>... promises);

    void shutdown();
}
