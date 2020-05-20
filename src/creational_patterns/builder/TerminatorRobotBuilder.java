package creational_patterns.builder;

public class TerminatorRobotBuilder implements RobotBuilder {
    private Robot robot;
    public TerminatorRobotBuilder(){
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
        System.out.println("setting arms");
    }

    @Override
    public void assembleLegs() {
        System.out.println("setting legs");
    }

    @Override
    public void assembleEyes() {
        System.out.println("setting eyes");
    }

    @Override
    public void assembleHead() {
        System.out.println("setting head");
    }

    @Override
    public void assembleWheels() {
        System.out.println("setting wheels");
    }

    @Override
    public void assembleFireArms() {
        System.out.println("setting fire arms");
    }

    @Override
    public void assembleDoors() {
        System.out.println("setting doors");
    }

    @Override
    public void assembleSensors() {
        System.out.println("setting sensors");
    }
}
