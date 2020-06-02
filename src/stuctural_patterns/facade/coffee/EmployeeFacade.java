package stuctural_patterns.facade.coffee;

public class EmployeeFacade {
    private Driver driver;
    private Barista barista;
    private Seller seller;

    public EmployeeFacade(){
        driver = new Driver();
        barista = new Barista();
        seller = new Seller();
    }
    public void drive(){
        driver.drive();
    }
    public void makeCoffee(){
        barista.makeCoffee();
    }
    public void sellCoffee(){
        seller.sell();
    }
}
