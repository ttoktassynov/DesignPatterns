package behavorial_patterns.mediator.bad;

public class CollegeB implements College{

    @Override
    public void send(College college) {
        String message = "hello friend!";
        System.out.println("College B sent a message = " + message
                + " to collegue A");
        college.receive(this, message);

    }

    @Override
    public void receive(College college, String message) {
        System.out.println("College B received a message = " + message
                + " from College A");
    }
}
