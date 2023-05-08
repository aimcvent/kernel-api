package fr.aimcvent.kernel.api.translation;

public interface Translator {
    Translator add(String key, String value);

    Translator add(String key, Translator value);

    String translate(Translation translation);
}
