package creational_patterns.abstract_factory.products;

public class RafeFoodMenu extends FoodMenu {
    public RafeFoodMenu(String menuStyle){
        super(menuStyle);
    }

    @Override
    public void render() {
        System.out.println("Rafe menu style");
    }

}
