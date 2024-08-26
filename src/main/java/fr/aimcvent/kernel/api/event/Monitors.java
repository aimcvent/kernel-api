package fr.aimcvent.kernel.api.event;

import java.util.List;

public interface Monitors {
    List<MonitorHandler> all();

    void register(MonitorHandler monitorHandler);

    void unregister(MonitorHandler monitorHandler);
}
