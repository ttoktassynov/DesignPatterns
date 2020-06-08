package stuctural_patterns.decorator.computers.bad;

public class SuperComputer implements Computer{
    @Override
    public void assemble() {
        System.out.println("we did basic computer");
        System.out.println("we added gaming power");
    }
}

