package behavorial_patterns.strategy;

public class MergeSortStrategy implements SortingStrategy{

    @Override
    public void execute() {
        System.out.println("Performed The merge sort algorithm");
    }
}
