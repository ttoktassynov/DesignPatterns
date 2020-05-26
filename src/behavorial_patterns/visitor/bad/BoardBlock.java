package behavorial_patterns.visitor.bad;

public class BoardBlock extends ChessComponent {
    private String color;
    private Piece piece;


    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

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
    public void visit() {
        System.out.println("this is a board block of name = " + this.getName()
                   + "of color = " + this.getColor());
    }
}
