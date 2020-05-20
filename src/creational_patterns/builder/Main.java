package creational_patterns.builder;

public class Main {
    public static void main(String [] args){
        RobotBuilder terminatorBuilder = new TerminatorRobotBuilder();
        terminatorBuilder.init();
        terminatorBuilder.assembleArms();
        terminatorBuilder.assembleDoors();
        terminatorBuilder.assembleFireArms();
        terminatorBuilder.assembleLegs();
        terminatorBuilder.assembleSensors();
        Robot robot = terminatorBuilder.build();

        terminatorBuilder.init();
        terminatorBuilder.assembleWheels();
        terminatorBuilder.assembleEyes();

        Robot visionRobot = terminatorBuilder.build();
        System.out.println(robot);
        System.out.println(visionRobot);

    }
}
