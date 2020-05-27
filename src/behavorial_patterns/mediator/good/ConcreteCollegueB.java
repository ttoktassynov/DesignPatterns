package behavorial_patterns.mediator.good;

import behavorial_patterns.mediator.good.Collegue;

public class ConcreteCollegueB extends Collegue {

    public ConcreteCollegueB(Mediator m){
        super("Eric", m);
    }

    @Override
    public void send() {
        String message = "I am good";
        System.out.println(getName() + " is sending a message = " + message);
        this.mediator.notifyCollegues(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(getName() + " just received " + message);
    }
}
