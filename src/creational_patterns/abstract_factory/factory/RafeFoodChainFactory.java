package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.products.FoodMenu;
import creational_patterns.abstract_factory.products.Furniture;
import creational_patterns.abstract_factory.products.RafeFoodMenu;
import creational_patterns.abstract_factory.products.RafeFurniture;

public class RafeFoodChainFactory implements FoodChainFactory{

    @Override
    public FoodMenu createFoodMenu() {
        return new RafeFoodMenu("Rafe style menu");
    }

    @Override
    public Furniture createFurniture() {
        return new RafeFurniture("Rafe furniture style");
    }
}
