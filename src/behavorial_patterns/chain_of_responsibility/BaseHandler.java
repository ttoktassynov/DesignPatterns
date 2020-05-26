package behavorial_patterns.chain_of_responsibility;

public class BaseHandler implements Handler{
    protected Handler next;

    @Override
    public void SetNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String request) {
        System.out.println("Base handler implementation");
        System.out.println("some message");
        if (next != null){
            next.handle(request);
        }
    }
}
