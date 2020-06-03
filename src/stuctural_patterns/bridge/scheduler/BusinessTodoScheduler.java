package stuctural_patterns.bridge.scheduler;

public class BusinessTodoScheduler extends TodoScheduler{

    public BusinessTodoScheduler(Platform platform){
        super(platform);
    }

    @Override
    public void schedule() {
        System.out.println("scheduled your business todos");
    }
}
