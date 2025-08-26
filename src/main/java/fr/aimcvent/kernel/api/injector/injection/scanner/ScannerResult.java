package fr.aimcvent.kernel.api.injector.injection.scanner;

import fr.aimcvent.kernel.api.injector.injection.provider.Provider;

import java.util.List;

public interface ScannerResult {
    List<Provider<?>> of();

    void inject();
}
