package stuctural_patterns.adapter;

public class Duck implements Bird {

    @Override
    public void makeSound() {
        System.out.println("Duck is making sound");
    }
}
