package creational_patterns.abstract_factory.products;

public class RafeFurniture extends Furniture {
    public RafeFurniture(String waterMark){
        super(waterMark);
    }

    @Override
    public void use() {
        System.out.println("Rafe furniture style");
    }

}
