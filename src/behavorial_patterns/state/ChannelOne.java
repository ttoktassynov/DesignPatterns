package behavorial_patterns.state;

public class ChannelOne implements State{
    private TvChannel tvChannel;
    public ChannelOne(TvChannel channel){
        this.tvChannel = channel;
    }
    @Override
    public void transitionTo(State state) {
        this.tvChannel.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("Channel 1");
    }
}
