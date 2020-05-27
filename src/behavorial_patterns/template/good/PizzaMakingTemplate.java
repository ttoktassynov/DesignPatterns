package behavorial_patterns.template.good;

public abstract class PizzaMakingTemplate {
    public abstract void getBread();
    public abstract void getCheese();
    public abstract void putInOven();
    public abstract void addToppings();

    public void make(){
        getBread();
        getCheese();
        addToppings();
        putInOven();
    }
}
