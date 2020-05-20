package behavorial_patterns.chain_of_responsibility;

public class CivilianHandler extends BaseHandler{
    @Override
    public void handle(String vehicleType) {
        if (vehicleType.equals("CivilianSUV")){
            System.out.println("Stop the car");
            System.out.println("Conduct thorough checking");
            System.out.println("Check the driver's license");
            System.out.println("let it go");
            return;
        }
        this.next.handle(vehicleType);
    }
}
