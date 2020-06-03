package stuctural_patterns.decorator.computers.bad;

public class WorkAndGameComputer extends BasicComputer{
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding gaming charachteristics");
        System.out.println("Adding work charachteristics");
    }
}
