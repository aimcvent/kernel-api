package fr.aimcvent.kernel.api.scheduler;

import java.util.concurrent.TimeUnit;

public interface Scheduler {
    long delay();

    long period();

    boolean overLapping();

    TimeUnit unit();

    SchedulerRunnable executor();

    void start();
}
