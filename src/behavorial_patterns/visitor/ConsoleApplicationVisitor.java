package behavorial_patterns.visitor;

public class ConsoleApplicationVisitor implements Visitor{

    @Override
    public void visit(BoardBlock b) {
        System.out.println("Visiting board bloack which is  "
                + b.getColor() + " and it has piec with name " + b.getName());
    }

    @Override
    public void visit(Piece p) {
        System.out.println("Visiting pice which is of "
                + p.getColor() + " color and its name is "
                + p.getName());
    }
}
