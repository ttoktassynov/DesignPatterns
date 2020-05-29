package stuctural_patterns.proxy;

public class Main {
    public static void main(String [] args){
        ServiceInterface proxy = new ServiceProxy();
        proxy.performOperation("www.facebook.com");
    }
}
