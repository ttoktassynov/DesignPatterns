package behavorial_patterns.state;

public class ChannelTwo implements State{
    private TvChannel tvChannel;
    public ChannelTwo(TvChannel channel){
        this.tvChannel = channel;
    }
    @Override
    public void transitionTo(State state) {
        this.tvChannel.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("Channel 2");
    }
}
