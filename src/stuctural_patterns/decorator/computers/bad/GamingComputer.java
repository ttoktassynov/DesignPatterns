package stuctural_patterns.decorator.computers.bad;

public class GamingComputer extends BasicComputer{
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding gaming charachteristics");
    }
}
