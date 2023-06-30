package fr.aimcvent.kernel.api.translation;

import fr.aimcvent.kernel.api.service.Service;

import java.util.List;
import java.util.Optional;

public interface Translations {
    List<Translation> all();

    Optional<Translation> def();

    Optional<Translation> findByAlias(String alias);

    Optional<Translation> findByName(String name);

    Translator of(Service service, String key);
}
