package fr.aimcvent.kernel.api.utils;

import java.util.Collection;

/**
 * Generic class allowing to contain a simple collection of elements.
 * @param <E> The element
 */
public interface Accessor<E> {
    /**
     * Allows you to retrieve the elements added.
     * @return elements
     */
    Collection<E> all();

    /**
     * Used to indicate if the element exists in the accessor.
     * @param element The element checked
     * @return if element exist or not.
     */
    boolean has(E element);

    /**
     * Allows you to add a new element.
     * @param element The element added
     * @return accessor
     */
    Accessor<E> add(E element);

    /**
     * Allows you to add a new elements.
     * @param element The elements added
     * @return accessor
     */
    Accessor<E> add(E[] element);

    /**
     * Allows you to remove a element.
     * @param element The element removed
     * @return accessor
     */
    Accessor<E> remove(E element);
}
