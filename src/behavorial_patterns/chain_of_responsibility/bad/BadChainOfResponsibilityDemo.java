package behavorial_patterns.chain_of_responsibility.bad;

public class BadChainOfResponsibilityDemo {
    public static void main(){
        String vehicleType = "CivilianSUV";
        if (vehicleType.equals("CivilianSUV")){
            System.out.println("Validate ID");
            System.out.println("Intensive check of cabin");
            System.out.println("Check truck");
            System.out.println("let it go");
        }
        else if(vehicleType.equals("FireTruck")){
            System.out.println("Validate ID");
            System.out.println("Let it go");
        }
        else if(vehicleType.equals("PoliceCar")){
            System.out.println("Update officer");
            System.out.println("let it go");
        }
        else if(vehicleType.equals("Ambulance")){
            System.out.println("Let it go");
        }
        else{
            throw new IllegalArgumentException("this type of car is now allowed!");
        }
    }
}
