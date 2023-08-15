package fr.aimcvent.kernel.api.scheduler;

@FunctionalInterface
public interface SchedulerRunnable {
    void run(SchedulerCancelable cancelable);
}
