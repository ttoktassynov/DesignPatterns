package creational_patterns.abstract_factory.client;

public class Customer {
    private RestaurantWithAbstractFactory restaurant;

    public Customer(RestaurantWithAbstractFactory restaurant){
        this.restaurant = restaurant;
    }

    public void visitRestaurant(){
        this.restaurant.renderRestaurant();
        //this.restaurant.getMenu().render();
        //this.restaurant.getFurniture().use();
    }

    public void setRestaurant(RestaurantWithAbstractFactory chain){
        this.restaurant = chain;
    }
}
