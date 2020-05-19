package creational_patterns.simple_factory.products;

public class Parrot extends Animal {
    public Parrot(String petName){
        super(petName);
    }
    @Override
    public void makeSound() {
        System.out.println("Piyu!");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + ", the little parrot is flying around!");
    }
}
