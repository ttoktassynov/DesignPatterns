package creational_patterns.builder;

public interface RobotBuilder {
    void assembleArms();
    void assembleLegs();
    void assembleEyes();
    void assembleHead();
    void assembleWheels();
    void assembleFireArms();
    void assembleDoors();
    void assembleSensors();
    Robot build();
    void init();
}
