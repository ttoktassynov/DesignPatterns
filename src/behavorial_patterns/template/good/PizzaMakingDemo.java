package behavorial_patterns.template.good;

public class PizzaMakingDemo {
    public static void main(String [] args){
        PizzaMakingTemplate cheesy = new CheesyPizza();
        PizzaMakingTemplate mexican = new MexicanPizza();

        cheesy.make();
        System.out.println();
        mexican.make();
    }

}
