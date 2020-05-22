package behavorial_patterns.command.bad;

public class HouseDemo {
    public static void main(String [] args){
        Light light = new Light("Bedroom light");
        light.on();
        light.off();
        light.on();
    }
}
