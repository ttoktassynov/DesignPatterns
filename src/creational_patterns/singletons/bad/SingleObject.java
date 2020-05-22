package creational_patterns.singletons.bad;

public class SingleObject {
    private static SingleObject instance;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;
    private SingleObject(int value){
        this.value = value;
    }
    public static SingleObject getInstance(int value){
        if (instance == null){
            instance = new SingleObject(value);
        }
        return instance;
    }
    public void showMessage(){}

    public static void main(String [] args){

    }
}
