package creational_patterns.abstract_factory.products;

public class DodopizzaFoodMenu extends FoodMenu{
    public DodopizzaFoodMenu(String menuStyle){
        super(menuStyle);
    }

    @Override
    public void render() {
        System.out.println("Dodopizza Style Menu");
    }
}
