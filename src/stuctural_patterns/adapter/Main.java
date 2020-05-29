package stuctural_patterns.adapter;

public class Main {
    public static void main(String [] args){
        Bird duck = new Duck();
        Bird penguin = new BirdAdapter(new ToyPenguin());
        penguin.makeSound();
        duck.makeSound();
    }
}
