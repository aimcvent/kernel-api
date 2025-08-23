package fr.aimcvent.kernel.api.injector.injection.scanner;

import fr.aimcvent.kernel.api.injector.injection.scanner.filter.Filters;

public interface Scanner {
    Filters filters();

    void scan(ClassLoader classLoader, String packageRoot);

    ScannerResult find(String... packages);

    ScannerResult find(Class<?> assignableFrom, String... packages);
}
