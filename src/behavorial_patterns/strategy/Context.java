package behavorial_patterns.strategy;

public class Context {
    private SortingStrategy strategy;
    public Context(SortingStrategy sortingStrategy){
        this.strategy = sortingStrategy;
    }

    public SortingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSmth(){
        this.strategy.execute();
    }
}
