package stuctural_patterns.adapter;

public class ToyPenguin implements ToyBird {

    @Override
    public void squeck() {
        System.out.println("Toy Penguin is making squeck!");
    }
}
