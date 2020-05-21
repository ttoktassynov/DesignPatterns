package behavorial_patterns.command;

public class Light extends Receiver{
    public Light(String name){
        super(name);
    }

    @Override
    public void on() {
        System.out.println("The light in " + super.getName() +" is On!");
    }

    @Override
    public void off() {
        System.out.println("The light in " + super.getName() + " is Off!");
    }
}
