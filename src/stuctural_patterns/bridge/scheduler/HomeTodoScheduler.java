package stuctural_patterns.bridge.scheduler;

public class HomeTodoScheduler extends TodoScheduler {

    public HomeTodoScheduler(Platform platform){
        super(platform);
    }

    @Override
    public void schedule() {
        System.out.println("Scheduled your home todos");
    }
}
