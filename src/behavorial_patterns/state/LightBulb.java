package behavorial_patterns.state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LightBulb {
    private Map<State, State> lightBulbStateMap =
            new HashMap<>();
    private State currentState;

    public LightBulb(){
        State onState = new OnState(this);
        State offState = new OffState(this);
        State intermediateState = new IntermediateState(this);
        this.lightBulbStateMap.put(onState, offState);
        this.lightBulbStateMap.put(offState, intermediateState);
        this.lightBulbStateMap.put(intermediateState, onState);
        currentState = offState;
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }
    public void displayState(){
        this.currentState.displayState();
    }
    public void toggle(){
        this.currentState.transitionTo(this.lightBulbStateMap.get(currentState));
    }
}
