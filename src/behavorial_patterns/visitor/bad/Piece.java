package behavorial_patterns.visitor.bad;

public class Piece extends ChessComponent {
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
    public void visit() {
        System.out.println("This is a piece of type = " + this.getName() +
                " with color = " + this.getColor());
    }
}
