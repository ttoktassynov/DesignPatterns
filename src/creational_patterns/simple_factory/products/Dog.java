package creational_patterns.simple_factory.products;

public class Dog extends Animal
{
    public Dog(String name){ super(name); }
    @Override
    public void makeSound() {
        System.out.println("bark!");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + ", the little dog is moving around!");
    }
}
