package fr.aimcvent.kernel.api.utils;

import fr.aimcvent.kernel.api.service.Service;

import java.util.UUID;

public interface Identifier {
    UUID raw();

    String of(Service service);
}
