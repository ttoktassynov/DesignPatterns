package creational_patterns.simple_factory.products;

public class Snake extends Animal{
    public Snake(String name){ super(name); }
    @Override
    public void makeSound() {
        System.out.println("pshsh!");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + ", the little snake is moving around!");
    }
}
