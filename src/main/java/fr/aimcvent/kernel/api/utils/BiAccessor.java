package fr.aimcvent.kernel.api.utils;

import java.util.Collection;

/**
 * Generic class allowing to contain a complex collection of keys and elements.
 * @param <K> The key
 * @param <E> The element
 */
public interface BiAccessor<K, E>
{
    /**
     * Allows you to retrieve the elements added.
     * @return elements
     */
    Collection<E> all();

    /**
     * Allows you to retrieve the keys added.
     * @return elements
     */
    Collection<K> keys();

    /**
     * Used to indicate if the key exists in the accessor.
     * @param key The key checked
     * @return if key exist or not.
     */
    boolean has(K key);

    /**
     * Allows you to retrieve the element with its key.
     * @return element
     */
    E of (K key);

    /**
     * Allows you to add a new element with a key.
     * @param key The key added
     * @param element The element added
     * @return accessor
     */
    BiAccessor<K, E> add(K key, E element);

    /**
     * Allows you to remove a key and its element.
     * @param key The key removed
     * @return accessor
     */
    BiAccessor<K, E> remove(K key);
}
