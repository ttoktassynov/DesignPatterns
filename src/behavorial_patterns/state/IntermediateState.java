package behavorial_patterns.state;

public class IntermediateState implements State{
    private LightBulb bulb;
    public IntermediateState(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void transitionTo(State state) {
        this.bulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("The light bulb is processing");
    }
}
