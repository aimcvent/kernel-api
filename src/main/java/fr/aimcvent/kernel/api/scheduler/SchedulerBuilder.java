package fr.aimcvent.kernel.api.scheduler;

import java.util.concurrent.TimeUnit;

public interface SchedulerBuilder {
    SchedulerBuilder delay(long delay);

    SchedulerBuilder period(long period);

    SchedulerBuilder disableOverLapping();

    SchedulerBuilder unit(TimeUnit unit);

    SchedulerBuilder executor(SchedulerRunnable runnable);

    Scheduler build();
}
