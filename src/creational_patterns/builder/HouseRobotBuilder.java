package creational_patterns.builder;

public class HouseRobotBuilder implements RobotBuilder {

    private Robot robot;


    public HouseRobotBuilder(){
    }
    @Override
    public Robot build(){
        return this.robot;
    }

    @Override
    public void init() {
        this.robot = new Robot();
    }

    @Override
    public void assembleArms() {
        System.out.println("setting house arms");
    }

    @Override
    public void assembleLegs() {
        System.out.println("setting house legs");
    }

    @Override
    public void assembleEyes() {
        System.out.println("setting house eyes");
    }

    @Override
    public void assembleHead() {
        System.out.println("setting house head");
    }

    @Override
    public void assembleWheels() {
        System.out.println("setting house wheels");
    }

    @Override
    public void assembleFireArms() {
    }

    @Override
    public void assembleDoors() {
        System.out.println("setting house doors");
    }

    @Override
    public void assembleSensors() {
        System.out.println("setting house sensors");
    }
}
