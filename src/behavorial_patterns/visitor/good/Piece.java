package behavorial_patterns.visitor.good;

public class Piece extends ChessComponent{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Piece(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
