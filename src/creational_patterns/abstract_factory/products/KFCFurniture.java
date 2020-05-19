package creational_patterns.abstract_factory.products;

public class KFCFurniture extends Furniture {
    public KFCFurniture(String waterMark){
        super(waterMark);
    }

    @Override
    public void use() {
        System.out.println("KFC Furniture style");
    }
}
