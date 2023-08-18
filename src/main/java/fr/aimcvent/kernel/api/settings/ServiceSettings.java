package fr.aimcvent.kernel.api.settings;

import fr.aimcvent.kernel.api.service.Service;

public interface ServiceSettings {
    Settings of(Service service) throws Exception;
}
