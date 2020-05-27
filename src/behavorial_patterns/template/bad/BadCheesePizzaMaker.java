package behavorial_patterns.template.bad;

public class BadCheesePizzaMaker implements IPizza {

    @Override
    public void getBread() {
        System.out.println("getting bread");
    }

    @Override
    public void getCheese() {
        System.out.println("getting cheese");
    }

    @Override
    public void addToppings() {
        System.out.println("adding toppings");
    }

    @Override
    public void addSalami() {
        System.out.println("adding salami");
    }

    @Override
    public void putInOven() {
        System.out.println("Putting it in the oven");
    }

    @Override
    public void make() {
        getBread();
        getCheese();
        addToppings();
        putInOven();
    }
}
