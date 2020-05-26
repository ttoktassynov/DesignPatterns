package behavorial_patterns.visitor;

public class BoardBlock extends ChessComponent{
    private String color;
    private Piece piece;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BoardBlock(String name, String color, Piece piece) {
        super(name);
        this.color = color;
        this.piece = piece;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
