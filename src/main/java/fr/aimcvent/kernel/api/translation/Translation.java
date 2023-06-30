package fr.aimcvent.kernel.api.translation;

import fr.aimcvent.kernel.api.service.Service;

public interface Translation {
    String name();

    String alias();

    String of(Service service, String key);
}
