package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.client.Customer;
import creational_patterns.abstract_factory.client.RestaurantWithAbstractFactory;
import creational_patterns.abstract_factory.factory.DodopizzaFoodChainFactory;
import creational_patterns.abstract_factory.factory.KFCFoodChainFactory;

public class Simulation {
    public static void main(String [] args){
        RestaurantWithAbstractFactory dodopizza =
                new RestaurantWithAbstractFactory(new DodopizzaFoodChainFactory());
        Customer customer = new Customer(dodopizza);
        customer.visitRestaurant();

        System.out.println();

        RestaurantWithAbstractFactory kfc =
                new RestaurantWithAbstractFactory(new KFCFoodChainFactory());
        customer.setRestaurant(kfc);
        customer.visitRestaurant();
    }
}
