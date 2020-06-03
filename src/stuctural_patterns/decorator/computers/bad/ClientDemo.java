package stuctural_patterns.decorator.computers.bad;

public class ClientDemo {
    public static void main(String [] args){
        Computer computer1 = new GamingComputer();
        Computer computer2 = new WorkComputer();
        Computer computer3 = new WorkAndGameComputer();

        computer1.assemble();
        System.out.println("====");
        computer2.assemble();
        System.out.println("====");
        computer3.assemble();
    }
}
