package stuctural_patterns.proxy;

public class ActualService implements ServiceInterface {

    @Override
    public void performOperation(String url) {
        System.out.println("The access has been granted to " + url + "!");
    }
}
