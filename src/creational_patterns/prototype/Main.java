package creational_patterns.prototype;

public class Main {
    public static void main(String [] args){
        ConcretePrototype original = new ConcretePrototype("Test name");
        ConcretePrototype other = new ConcretePrototype("Other value");

        PrototypeRegistry registry = new PrototypeRegistry();

        registry.addPrototypeRegistry("Original", original);
        registry.addPrototypeRegistry("Other", other);

        ConcretePrototype clone = (ConcretePrototype)
                registry.getPrototypeCloneFromPrototypeRegistry("Other");
        System.out.println(other);
        System.out.println(clone);

        System.out.println(original.getName());
        System.out.println(clone.getName());
    }
}
