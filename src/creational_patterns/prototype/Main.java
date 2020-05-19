package creational_patterns.prototype;

public class Main {
    public static void main(String [] args){
        ConcretePrototype original = new ConcretePrototype("Test name");

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototypeRegistry("Original", original);

        ConcretePrototype clone = (ConcretePrototype) registry.getPrototypeCloneFromPrototypeRegistry("Other");
        System.out.println(original);
        System.out.println(clone);

        System.out.println(original.getName());
        System.out.println(clone.getName());
    }
}
