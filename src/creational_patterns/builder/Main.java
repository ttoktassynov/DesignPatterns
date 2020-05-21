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
        robot.setName("Terminator");
        System.out.println(robot.getName());
        System.out.println();

        // initialize new robot and add parts to it
        terminatorBuilder.init();
        terminatorBuilder.assembleEyes();
        terminatorBuilder.assembleHead();

        Robot newRobot = terminatorBuilder.build();
        System.out.println(robot);
        System.out.println(newRobot);

    }
}
