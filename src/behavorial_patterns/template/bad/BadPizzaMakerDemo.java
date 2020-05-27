package behavorial_patterns.template.bad;

public class BadPizzaMakerDemo {
    public static void main(String [] args){
        IPizza cheesyPizza = new BadCheesePizzaMaker();
        IPizza mexicanPizza = new BadMexicanPizzaMaker();
        cheesyPizza.make();
        System.out.println("----");
        mexicanPizza.make();
    }
}
