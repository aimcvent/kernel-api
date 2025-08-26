package fr.aimcvent.kernel.api.module;

import fr.aimcvent.kernel.api.logger.Logger;

import java.io.File;
import java.util.List;

public interface Modules {
    List<Module> all();

    Module parent();

    Logger logger();

    void load(File... files);

    void add(Module module);
}
