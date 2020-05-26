package behavorial_patterns.chain_of_responsibility;

public class PoliceCarHandler extends BaseHandler{
    public void handle(String vehicleType){
        if (vehicleType.equals("Police-car")){
            System.out.println("Stop the car");
            System.out.println("update the officers");
            System.out.println("let them go");
            return;
        }
        this.next.handle(vehicleType);
    }
}
