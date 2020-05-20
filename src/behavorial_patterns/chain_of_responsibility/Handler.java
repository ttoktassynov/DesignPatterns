package behavorial_patterns.chain_of_responsibility;

public interface Handler {
    void SetNext(Handler next);
    void handle(String request);
}
