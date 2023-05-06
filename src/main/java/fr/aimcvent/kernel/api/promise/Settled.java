package fr.aimcvent.kernel.api.promise;

public interface Settled<T>
{
    Status status();

    T value();

    Throwable throwable();

    String reason();

    long time();
}
