package creational_patterns.singletons.good;

public class GoodSingletonDemo {
    public static void main(String [] args){
        EnumSingleton mySingleton = EnumSingleton.INSTANCE;
        mySingleton.setValue(3);
        System.out.println(mySingleton.getValue());

        EnumSingleton hisSingleton = EnumSingleton.INSTANCE;
        System.out.println(hisSingleton.getValue());

        mySingleton.setValue(9);
        System.out.println(mySingleton.getValue());
        System.out.println(hisSingleton.getValue());
    }
}
