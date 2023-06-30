package fr.aimcvent.kernel.api.promise;

public enum Status
{
    WAITING,
    RUNNING,
    FULFILLED(true),
    REJECTED(true);

    private final boolean completed;

    Status()
    {
        this(false);
    }

    Status(boolean completed)
    {
        this.completed = completed;
    }

    public boolean completed() {
        return this.completed;
    }
}
