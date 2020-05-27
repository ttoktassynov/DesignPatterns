package behavorial_patterns.mediator.good;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteMediator implements Mediator{

    Map<String, Collegue> regCollege =
            new HashMap<>();

    private final String COLLEGE_A = "John";
    private final String COLLEGE_B = "Eric";

    @Override
    public void register(Collegue collegue) {
        regCollege.put(collegue.getName(), collegue);
    }

    @Override
    public void notifyCollegues(Collegue sender, String message) {
        String name = sender.getName();

        if (COLLEGE_A.equals(name)){
            reactOnA(message);
        }
        else if (COLLEGE_B.equals(name)){
            reactOnB(message);
        }
    }

    private void reactOnA(String message){
        System.out.println("Mediator is in action: ");
        regCollege.get(COLLEGE_B).receive(message);
    }
    private void reactOnB(String message){
        System.out.println("Mediator is in action: ");
        regCollege.get(COLLEGE_A).receive(message);
    }
    //...///..//
}
