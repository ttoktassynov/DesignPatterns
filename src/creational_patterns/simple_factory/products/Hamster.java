package creational_patterns.simple_factory.products;

public class Hamster extends Animal{
    public Hamster(String name){ super(name); }
    @Override
    public void makeSound() {
        System.out.println("brr!");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + ", the little hamster is moving around!");
    }
}
