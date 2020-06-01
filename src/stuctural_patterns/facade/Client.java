package stuctural_patterns.facade;

public class Client {
    public static void main(String [] args){
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.drive();
        employeeFacade.sellCoffee();
        employeeFacade.makeCoffee();
    }
}
