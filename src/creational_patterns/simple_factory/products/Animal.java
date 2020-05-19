package creational_patterns.simple_factory.products;

public abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void makeSound();
    public abstract void moveAround();
    public String getName() { return this.name; }
}
