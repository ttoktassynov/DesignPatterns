package behavorial_patterns.visitor;

public interface Visitor {
    void visit(Piece piece);
    void visit(BoardBlock boardBlock);
}
