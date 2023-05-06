package fr.aimcvent.kernel.api.logger;

import fr.aimcvent.kernel.api.service.Service;

import java.util.logging.Logger;

public interface Loggers {
    Logger of(String name);
    Logger of(Service service);
}
