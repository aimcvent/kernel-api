package fr.aimcvent.kernel.api.injector.injection.scanner;

import fr.aimcvent.kernel.api.injector.injection.scanner.filter.Filters;
import fr.aimcvent.kernel.api.module.Module;

public interface Scanner {
    Filters filters();

    void scan(Module module);

    ScannerResult find(String... packages);

    ScannerResult find(Class<?> assignableFrom, String... packages);
}
