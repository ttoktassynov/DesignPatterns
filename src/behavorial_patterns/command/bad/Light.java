package behavorial_patterns.command.bad;

public class Light {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Light(String name){
        this.name = name;
    }
    public void on(){
        System.out.println("the light is on");
    }
    public void off(){
        System.out.println("the light is off");
    }
}
