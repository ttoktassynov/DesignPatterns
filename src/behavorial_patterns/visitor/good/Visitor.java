package behavorial_patterns.visitor.good;

public interface Visitor {
    void visit(Piece piece);
    void visit(BoardBlock boardBlock);
}
