package behavorial_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Subject {

    private int goldenNumber = 3;

    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(goldenNumber);
        }
    }
    public void updateGoldenNumber(int i){
        this.goldenNumber = i;
        notifyObservers();
    }
}
