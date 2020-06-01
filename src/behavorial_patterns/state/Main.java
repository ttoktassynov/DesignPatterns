package behavorial_patterns.state;

public class Main {
    public static void main(String [] args){
        LightBulb bulb  = new LightBulb();

        bulb.displayState();// off
        bulb.toggle();
        bulb.displayState();// processing...
        bulb.toggle();
        bulb.displayState();

        System.out.println("");
        TvChannel channel = new TvChannel();

        channel.displayState();//1
        channel.toggle();//2
        channel.displayState();
        channel.toggle();//3
        channel.displayState();
        channel.toggle();
        channel.displayState();
        channel.toggle(new ChannelOne(channel));
        channel.displayState();
    }
}
