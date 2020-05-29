package behavorial_patterns.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TvChannel {
    private Map<State, State> tvChannelStateMap =
            new HashMap<>();
    //private List<State> tvChannels = new ArrayList<>();
    State currentState;
    //private int curIndex = - 1;

    public TvChannel(){
        State channelOne = new ChannelOne(this);
        State channelTwo = new ChannelTwo(this);
        State channelThree = new ChannelThree(this);
        this.tvChannelStateMap.put(channelOne, channelTwo);
        this.tvChannelStateMap.put(channelTwo, channelThree);
        this.tvChannelStateMap.put(channelThree, channelOne);
        //tvChannels.add(channelOne);
        //tvChannels.add(channelTwo);
        //tvChannels.add(channelThree);
        currentState = channelOne;
        //curIndex = 0;
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }
    public void displayState(){
        this.currentState.displayState();
    }
    public void toggle(){
        //curIndex++;
        //this.currentState.transitionTo(tvChannels.get(curIndex % 3));
        this.currentState.transitionTo(tvChannelStateMap.get(currentState));
    }
}
