package behavorial_patterns.mediator.bad;

public interface College {
    void send(College college);
    void receive(College college, String message);
}
