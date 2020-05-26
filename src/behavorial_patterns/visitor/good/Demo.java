package behavorial_patterns.visitor.good;

public class Demo {

    public static void main(String [] args){
        ChessComponent king = new Piece("king", "white");
        ChessComponent blockComponent = new BoardBlock("h2a2",
                "black", (Piece) king);

        Visitor consoleApplicationVisitor =
                new ConsoleApplicationVisitor();

       king.accept(consoleApplicationVisitor);
       blockComponent.accept(consoleApplicationVisitor);
    }
}
