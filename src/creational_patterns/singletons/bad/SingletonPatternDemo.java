package creational_patterns.singletons.bad;

public class SingletonPatternDemo {
    public static void main(String [] args){
        SingleObject mySingleton = SingleObject.getInstance(2);
        System.out.println(mySingleton.getValue());

        SingleObject hisSingleton = SingleObject.getInstance(3);
        System.out.println(mySingleton.getValue());
        System.out.println(hisSingleton.getValue());
    }

}
