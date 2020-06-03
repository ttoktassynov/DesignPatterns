package stuctural_patterns.bridge.scheduler;

public class CustomerDemo {
    public static void main(String [] args){
        TodoScheduler businessVersion = new BusinessTodoScheduler(new WindowsPlatform());
        TodoScheduler homeVersion = new HomeTodoScheduler(new UnixPlatform());

        businessVersion.getPlatform().build();
        homeVersion.getPlatform().build();

        businessVersion.schedule();
        homeVersion.schedule();
    }
}
