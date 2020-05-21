package creational_patterns.builder;

public class Robot {
    private String arms;
    private String legs;
    private String eyes;
    private String head;
    private String wheels;
    private String firearms;
    private String doors;
    private String sensors;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot() {}
    public Robot(String arms, String legs, String head, String sensors){
        this.arms = arms;
        this.legs = legs;
        this.head = head;
        this.sensors = sensors;
    }
    public Robot(String firearms, String wheels, String sensors){
        this.firearms = firearms;
        this.wheels = wheels;
        this.sensors = sensors;
    }
    public String getArms() {
        return arms;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getFirearms() {
        return firearms;
    }

    public void setFirearms(String firearms) {
        this.firearms = firearms;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }
}
