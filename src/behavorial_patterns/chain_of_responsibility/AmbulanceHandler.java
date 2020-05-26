package behavorial_patterns.chain_of_responsibility;

public class AmbulanceHandler extends BaseHandler{
    public void handle(String vehicleType){
        if (vehicleType.equals("Ambulance")){
            System.out.println("let them go");
            return;
        }
        super.handle(vehicleType);
        //throw new IllegalArgumentException("the vehicle is now allowed!");
    }
}
