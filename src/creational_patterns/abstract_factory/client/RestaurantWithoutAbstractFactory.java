package creational_patterns.abstract_factory.client;

import creational_patterns.abstract_factory.products.*;

public class RestaurantWithoutAbstractFactory {
    public FoodMenu menu;
    public Furniture furniture;

    public RestaurantWithoutAbstractFactory(String foodChainType){
        if (foodChainType.equals("Dodopizza")) {
            this.menu = new DodopizzaFoodMenu("Dodopizza Menu Style");
            this.furniture = new DodopizzaFurniture("Dodopizza furniture");
        }
        // it can go on forever
        else if (foodChainType.equals("KFC")){
            this.menu = new KFCFoodMenu("KFC Menu Style");
            this.furniture = new KFCFurniture("KFC furniture");
        }
        else {
            throw new IllegalArgumentException("Invalid chain type");
        }
    }

    public FoodMenu getMenu() {
        return menu;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
