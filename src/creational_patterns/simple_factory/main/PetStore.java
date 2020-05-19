package creational_patterns.simple_factory.main;

import creational_patterns.simple_factory.products.Animal;
import creational_patterns.simple_factory.products.Cat;
import creational_patterns.simple_factory.products.Dog;
import creational_patterns.simple_factory.products.Parrot;

public class PetStore {
    private String property;
    private AnimalFactory factory;

    public PetStore(AnimalFactory factory){
        this.factory = factory;
    }
    public static void main(String[] args) {
        PetStore petStore = new PetStore(new PetStoreFactory());
        try{
            Animal pet = petStore.orderPet("Dollar", "Dog");
            pet.makeSound();
            pet.moveAround();
        }
        catch(IllegalArgumentException | IllegalAccessException ex){
            System.out.println("There is no such animal in pet store");
        }
    }

    public Animal orderPet(String petName, String petType) throws IllegalAccessException {
        return this.factory.orderPet(petName, petType);
    }
}
