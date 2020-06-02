package stuctural_patterns.facade.coffee;

public class Barista implements IBarista{
    @Override
    public void makeCoffee() {
        System.out.println("I am making coffee differently");
    }
}
