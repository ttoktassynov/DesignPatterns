package stuctural_patterns.bridge.scheduler;

public abstract class TodoScheduler {

    private Platform platform;

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public TodoScheduler(Platform platform){
        this.platform = platform;
    }

    public abstract void schedule();
}
