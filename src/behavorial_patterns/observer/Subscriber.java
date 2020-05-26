package behavorial_patterns.observer;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update(int i) {
        System.out.println(this.name +
                " got message " + i);
    }
}
