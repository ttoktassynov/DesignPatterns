package behavorial_patterns.strategy;

public class Demo {
    private Context context;
    public Demo(Context context){
        this.context = context;
    }
    public static void main(String [] args){
        Context context = new Context(new BubbleSortStrategy());
        Demo sortingDemo = new Demo(context);
        sortingDemo.executeSort();

        sortingDemo.context.setStrategy(new MergeSortStrategy());
        sortingDemo.executeSort();
    }

    public void executeSort(){
        this.context.doSmth();
    }
}
