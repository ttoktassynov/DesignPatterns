package stuctural_patterns.facade;

public class Barista implements IBarista{
    @Override
    public void makeCoffee() {
        System.out.println("I am making coffee differently");
    }
}
