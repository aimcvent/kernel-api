package fr.aimcvent.kernel.api.module;

import java.io.File;
import java.util.List;

public interface Modules {
    List<Module> all();

    Module parent();

    void load(File... files);

    void add(Module module);
}
