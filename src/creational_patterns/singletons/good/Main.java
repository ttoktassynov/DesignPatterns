package creational_patterns.singletons.good;

public class Main {
    public static void notifyCients(DaysOfWeekEnum day){
        if (day.name() == "THU"){
            System.out.println("Congrats!");
        }
    }

    public static void main(String [] args){
        notifyCients(DaysOfWeekEnum.THU);

    }

}
