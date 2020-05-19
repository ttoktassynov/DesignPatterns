package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.products.FoodMenu;
import creational_patterns.abstract_factory.products.Furniture;

public interface FoodChainFactory {
    FoodMenu createFoodMenu();
    Furniture createFurniture();
}
