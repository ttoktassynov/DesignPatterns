package creational_patterns.abstract_factory.products;

public class DodopizzaFurniture extends Furniture{

    public DodopizzaFurniture(String waterMark){
        super(waterMark);
    }

    @Override
    public void use() {
        System.out.println("Dodopizza Style Furniture");
    }

}
