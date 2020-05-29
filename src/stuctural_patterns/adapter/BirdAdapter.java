package stuctural_patterns.adapter;

public class BirdAdapter implements Bird {

    private ToyBird toyBird;

    public BirdAdapter(ToyBird bird){
        this.toyBird = bird;
    }

    @Override
    public void makeSound() {
        toyBird.squeck();
    }
}
