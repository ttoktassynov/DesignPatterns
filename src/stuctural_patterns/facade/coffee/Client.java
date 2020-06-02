package stuctural_patterns.facade.coffee;

public class Client {
    public static void main(String [] args){
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.drive();
        employeeFacade.sellCoffee();
        employeeFacade.makeCoffee();
    }
}
