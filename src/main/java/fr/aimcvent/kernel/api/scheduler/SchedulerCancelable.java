package fr.aimcvent.kernel.api.scheduler;

public interface SchedulerCancelable {
    boolean isCancelled();
    void cancel();
}
