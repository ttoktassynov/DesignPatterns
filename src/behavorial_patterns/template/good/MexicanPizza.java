package behavorial_patterns.template.good;

public class MexicanPizza extends PizzaMakingTemplate {

    @Override
    public void getBread() {
        System.out.println("getting bread");
    }

    @Override
    public void getCheese() {

    }

    @Override
    public void putInOven() {
        System.out.println("putting in oven");
    }

    @Override
    public void addToppings() {
        System.out.println("adding toppings");
    }
}
