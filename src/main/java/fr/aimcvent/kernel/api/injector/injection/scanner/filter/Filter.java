package fr.aimcvent.kernel.api.injector.injection.scanner.filter;

public interface Filter {
    boolean accept(Class<?> clazz);
}
