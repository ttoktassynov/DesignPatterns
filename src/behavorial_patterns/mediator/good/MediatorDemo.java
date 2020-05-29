package behavorial_patterns.mediator.good;

public class MediatorDemo {
    public static void main(String [] args){
        Mediator mediator = new ConcreteMediator();

        Collegue john = new ConcreteCollegueA(mediator);
        Collegue ben = new ConcreteCollegueA(mediator);

        ben.setName("Ben");
        Collegue eric = new ConcreteCollegueB(mediator);

        mediator.register(john);
        mediator.register(eric);
        mediator.register(ben);

        john.send();
        System.out.println();
        eric.send();
    }
}
