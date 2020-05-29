package behavorial_patterns.state;

public interface State {
    void transitionTo(State state);
    void displayState();
}
