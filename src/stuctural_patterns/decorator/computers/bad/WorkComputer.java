package stuctural_patterns.decorator.computers.bad;

public class WorkComputer extends BasicComputer{
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding work charachteristics");
    }
}
