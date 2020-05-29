package stuctural_patterns.proxy;

public class ServiceProxy implements ServiceInterface {

    ServiceInterface actualService;
    public ServiceProxy(){
        actualService = new ActualService();
    }
    @Override
    public void performOperation(String url) {
        System.out.println("Going via proxy...");
        //
        //
        if ("www.facebook.com".equals(url)){
            System.out.println("This site is now allowed in our company!");
            return;
        }
        actualService.performOperation(url);
    }
}
