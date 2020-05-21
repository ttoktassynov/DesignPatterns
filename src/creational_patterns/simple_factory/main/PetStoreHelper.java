package creational_patterns.simple_factory.main;

import creational_patterns.simple_factory.products.Animal;
import creational_patterns.simple_factory.products.Cat;
import creational_patterns.simple_factory.products.Dog;
import creational_patterns.simple_factory.products.Parrot;

public class PetStoreHelper {
    public static Animal orderPet(String petName, String petType){
        if (petType.equals("Cat")){
            return new Cat(petName);
        }
        else if (petType.equals("Dog")){
            return new Dog(petName);
        }
        else if (petType.equals("Parrot")){
            return new Parrot(petName);
        }
        else if (petType.equals("Hamster")){
            return new Parrot(petName);
        }
        else{
            throw new IllegalArgumentException("THere is no such pet in store!");
        }
    }
}
