package stuctural_patterns.facade;

public class Driver implements IDriver {
    @Override
    public void drive() {
        System.out.println("I am driving around");
    }
}
