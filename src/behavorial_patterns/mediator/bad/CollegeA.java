package behavorial_patterns.mediator.bad;

public class CollegeA implements College{

    @Override
    public void send(College college) {
        String message = "hello friend!";
        System.out.println("College A sent a message = " + message
                + " to collegue B");
        college.receive(this, message);
    }

    @Override
    public void receive(College college, String message) {
        System.out.println("College A received a message = " + message
                + " from College B");
    }
}
