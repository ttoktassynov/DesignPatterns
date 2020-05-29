package behavorial_patterns.state;

public class OffState implements State{
    private LightBulb bulb;
    public OffState(LightBulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void transitionTo(State state) {
        this.bulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("The light bulb is off");
    }
}
