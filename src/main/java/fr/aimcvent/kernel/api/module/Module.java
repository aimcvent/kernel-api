package fr.aimcvent.kernel.api.module;

import java.util.List;

public interface Module {
    String name();

    ClassLoader classLoader();

    String packageRoot();

    List<Module> dependencies();
}
