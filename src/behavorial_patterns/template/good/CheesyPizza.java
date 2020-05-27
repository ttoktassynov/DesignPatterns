package behavorial_patterns.template.good;

public class CheesyPizza extends PizzaMakingTemplate{

    @Override
    public void getBread() {
        System.out.println("getting bread");
    }

    @Override
    public void getCheese() {
        System.out.println("getting cheese");
    }

    @Override
    public void putInOven() {
        System.out.println("putting in oven");
    }

    @Override
    public void addToppings() {

    }
}
