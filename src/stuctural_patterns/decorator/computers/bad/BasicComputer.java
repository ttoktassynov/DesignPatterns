package stuctural_patterns.decorator.computers.bad;

public class BasicComputer implements Computer{
    @Override
    public void assemble() {
        System.out.println("Assembling basic computer");
    }
}
