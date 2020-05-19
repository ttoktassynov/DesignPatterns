package creational_patterns.abstract_factory.products;

public abstract class Furniture {
    private String waterMark;

    public Furniture(String waterMark){
        this.waterMark = waterMark;
    }

    public abstract void use();
}
