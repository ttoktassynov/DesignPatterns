package behavorial_patterns.strategy;

public class BubbleSortStrategy implements SortingStrategy{

    @Override
    public void execute() {
        System.out.println("Performed Bubble Sort Algorithm");
    }
}
