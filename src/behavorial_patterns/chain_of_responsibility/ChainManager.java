package behavorial_patterns.chain_of_responsibility;

public class ChainManager {
    public Handler getHeadHandler(){
        Handler civilianHandler = new CivilianHandler();
        Handler fireTrackHandler = new FireTrackHandler();
        Handler policeCarHandler  = new PoliceCarHandler();
        Handler ambulanceHandler = new AmbulanceHandler();

        civilianHandler.SetNext(fireTrackHandler);
        fireTrackHandler.SetNext(policeCarHandler);
        policeCarHandler.SetNext(ambulanceHandler);
        return civilianHandler;
    }
}
