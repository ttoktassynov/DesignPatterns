package behavorial_patterns.mediator.good;

import behavorial_patterns.mediator.good.Mediator;

public abstract class Collegue {
    private String name;
    protected Mediator mediator;

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Collegue(String name, Mediator m){
        this.name = name;
        this.mediator = m;
    }
    public abstract void send();
    public abstract void receive(String message);

}
