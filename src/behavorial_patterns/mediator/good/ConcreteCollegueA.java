package behavorial_patterns.mediator.good;

import behavorial_patterns.mediator.good.Collegue;

public class ConcreteCollegueA extends Collegue {

    public ConcreteCollegueA(Mediator m){
        super("John", m);
    }

    @Override
    public void send() {
        String message = "Hey, whatsapp?";
        System.out.println(getName() + " is sending a message = " + message);
        this.mediator.notifyCollegues(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(getName() + " just received " + message);
    }
}
