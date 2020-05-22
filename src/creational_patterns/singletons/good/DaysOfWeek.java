package creational_patterns.singletons.good;

public class DaysOfWeek {

    private DaysOfWeek(String title){
        this.title = title;
    }

    public static DaysOfWeek MON = new DaysOfWeek("MON");
    public static DaysOfWeek TUE = new DaysOfWeek("TUE");
    public static DaysOfWeek WED = new DaysOfWeek("WED");
    public static DaysOfWeek THUR = new DaysOfWeek("THU");
    public static DaysOfWeek FRI = new DaysOfWeek("WED");
    public static DaysOfWeek SAT = new DaysOfWeek("SAT");
    public static DaysOfWeek SUN = new DaysOfWeek("SUN");


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

}


