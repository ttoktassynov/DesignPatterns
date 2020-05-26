package behavorial_patterns.strategy;

public class Demo {

    public static void main(String [] args){
        Context context = new Context(new BubbleSortStrategy());
        context.doSmth();

        context.setStrategy(new MergeSortStrategy());
        context.doSmth();
    }

}
