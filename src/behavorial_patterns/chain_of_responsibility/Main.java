package behavorial_patterns.chain_of_responsibility;

public class Main {
    public static void main(String [] args){
        ChainManager manager = new ChainManager();
        Handler vehicleHandler = manager.getHeadHandler();
        vehicleHandler.handle("CivilianSUV");
        vehicleHandler.handle("Fire-truck");

    }
}
