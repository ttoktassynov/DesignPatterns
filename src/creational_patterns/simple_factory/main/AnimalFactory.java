package creational_patterns.simple_factory.main;

import creational_patterns.simple_factory.products.Animal;

public interface AnimalFactory {
    Animal orderPet(String petName, String petType) throws IllegalAccessException;
}
