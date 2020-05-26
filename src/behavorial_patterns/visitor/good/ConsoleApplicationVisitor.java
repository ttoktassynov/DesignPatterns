package behavorial_patterns.visitor.good;

public class ConsoleApplicationVisitor implements Visitor{

    @Override
    public void visit(BoardBlock b) {
        System.out.println("Visiting board block wiht name =  "
                + b.getName() + " with color = "
                + b.getColor() + " and with piece named " + b.getPiece().getName());
    }

    @Override
    public void visit(Piece p) {
        System.out.println("Visiting piece with color = "
                + p.getColor() + " and name ="
                + p.getName());
    }
}
