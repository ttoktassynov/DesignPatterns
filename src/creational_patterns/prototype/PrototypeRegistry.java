package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype> prototypRegistry;
    public PrototypeRegistry(){
        this.prototypRegistry = new HashMap<>();
    }

    public void addPrototypeRegistry(String prototypeName, Prototype prototype) {
        this.prototypRegistry.put(prototypeName, prototype);
    }

    public Prototype getPrototypeCloneFromPrototypeRegistry(String prototypeName){
        if (this.prototypRegistry.get(prototypeName) != null) {
            return this.prototypRegistry.get(prototypeName).clone();
        }
        else{
            return new ConcretePrototype("empty");
        }
    }
}
