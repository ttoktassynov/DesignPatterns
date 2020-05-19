package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.products.DodopizzaFoodMenu;
import creational_patterns.abstract_factory.products.DodopizzaFurniture;
import creational_patterns.abstract_factory.products.FoodMenu;
import creational_patterns.abstract_factory.products.Furniture;

public class DodopizzaFoodChainFactory implements FoodChainFactory {

    @Override
    public FoodMenu createFoodMenu() {
        return new DodopizzaFoodMenu("Dodopizza Style Food Menu");
    }

    @Override
    public Furniture createFurniture() {
        return new DodopizzaFurniture("Dodpizza Style Furniture");
    }
}
