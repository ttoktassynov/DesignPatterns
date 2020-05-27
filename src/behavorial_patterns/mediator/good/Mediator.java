package behavorial_patterns.mediator.good;

public interface Mediator {
    void register(Collegue collegue);
    void notifyCollegues(Collegue sender, String message);
}
