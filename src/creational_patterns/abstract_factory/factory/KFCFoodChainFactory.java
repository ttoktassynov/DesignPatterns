package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.products.FoodMenu;
import creational_patterns.abstract_factory.products.Furniture;
import creational_patterns.abstract_factory.products.KFCFoodMenu;
import creational_patterns.abstract_factory.products.KFCFurniture;

public class KFCFoodChainFactory implements FoodChainFactory{

    @Override
    public FoodMenu createFoodMenu() {

        return new KFCFoodMenu("KFC Menu Style");
    }

    @Override
    public Furniture createFurniture() {
        return new KFCFurniture("KFC Furniture Style");
    }
}
