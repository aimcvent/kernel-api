package fr.aimcvent.kernel.api.module;

import fr.aimcvent.kernel.api.logger.Logger;

import java.util.List;

public interface Module {
    String name();

    ClassLoader classLoader();

    String packageRoot();

    List<Module> dependencies();

    Logger logger();
}
