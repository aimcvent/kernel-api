package fr.aimcvent.kernel.api.service;

import java.io.File;
import java.io.IOException;

public interface ServiceLoader {
    void load(File... files) throws IOException;
}
