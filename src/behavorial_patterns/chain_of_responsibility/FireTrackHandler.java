package behavorial_patterns.chain_of_responsibility;

public class FireTrackHandler extends BaseHandler{
    public void handle(String vehicleType){
        if (vehicleType.equals("Fire-truck")){
            System.out.println("let it go");
            return;
        }
        this.next.handle(vehicleType);
    }
}
