package behavorial_patterns.state;

public class Main {
    public static void main(String [] args){
        LightBulb bulb  = new LightBulb();

        bulb.displayState();
        bulb.toggle();
        bulb.displayState();

        System.out.println();
        TvChannel channel = new TvChannel();

        channel.displayState();
        channel.toggle();
        channel.toggle();
        channel.toggle();
        channel.displayState();
    }
}
