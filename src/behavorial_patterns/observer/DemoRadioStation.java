package behavorial_patterns.observer;

public class DemoRadioStation {
    public static void main(String [] args){
        Subject radio = new RadioStation();
        Observer observer1 = new Subscriber("John");
        Observer observer2 = new Subscriber("Matt");
        Observer observer3 = new Subscriber("Jackie");
        Observer observer4 = new Subscriber("Tim");

        radio.registerObserver(observer1);
        radio.registerObserver(observer2);
        radio.registerObserver(observer3);
        radio.registerObserver(observer4);

        radio.notifyObservers();
        System.out.println();

        radio.removeObserver(observer1);
        radio.removeObserver(observer4);
        radio.updateGoldenNumber(56);
    }
}
