package stuctural_patterns.facade;

public class Seller implements ISale{
    @Override
    public void sell() {
        System.out.println("I am selling");
    }
}
