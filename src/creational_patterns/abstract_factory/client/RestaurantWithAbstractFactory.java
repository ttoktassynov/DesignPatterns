package creational_patterns.abstract_factory.client;

import creational_patterns.abstract_factory.factory.FoodChainFactory;
import creational_patterns.abstract_factory.products.FoodMenu;
import creational_patterns.abstract_factory.products.Furniture;

public class RestaurantWithAbstractFactory {
    private FoodMenu menu;
    private Furniture furniture;

    public RestaurantWithAbstractFactory(FoodChainFactory foodChainFactory){
        this.menu = foodChainFactory.createFoodMenu();
        this.furniture = foodChainFactory.createFurniture();
    }

    public FoodMenu getMenu(){
        return menu;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void renderRestaurant(){
        this.menu.render();
        this.furniture.use();
    }
}
