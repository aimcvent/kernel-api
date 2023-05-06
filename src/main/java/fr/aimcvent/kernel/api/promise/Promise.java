package fr.aimcvent.kernel.api.promise;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Promise<T>
{
    Promise<T> then(Consumer<? super T> fulfill);

    Promise<T> then(Consumer<? super T> fulfill, Consumer<? super Throwable> reject);

    <V> Promise<V> map(Function<? super T, ? extends V> fulfill);

    <V> Promise<V> map(Function<? super T, ? extends V> fulfill, Function<? super Throwable, ? extends V> reject);

    <V> Promise<V> error(Consumer<? super Throwable> reject);

    Promise<T> last(Runnable last);

    Settled<T> settled();

    T await();

    void async();
}
