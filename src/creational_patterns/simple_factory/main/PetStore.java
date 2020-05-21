package creational_patterns.simple_factory.main;

import creational_patterns.simple_factory.products.*;

public class PetStore {
    private AnimalFactory factory;
    public PetStore(AnimalFactory factory){
        this.factory = factory;
    }
    public static void main(String[] args) {
        PetStore petStore = new PetStore(new PetStoreFactory());
        Animal pet = petStore.orderPet("Google", "Parrot");
        pet.makeSound();
        pet.moveAround();
        Animal petForFriend = petStore.orderPet("Hatiko", "Dog");
        petForFriend.makeSound();
    }

    public Animal orderPet(String petName, String petType) {
        return factory.orderPet(petName, petType);
    }
}

// PetStore -> PetStoreHelper Bad Coupling