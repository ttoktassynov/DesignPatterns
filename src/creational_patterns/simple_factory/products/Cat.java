package creational_patterns.simple_factory.products;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void moveAround() {
        System.out.println(getName() + ", the little kitten is moving around!");
    }
}
