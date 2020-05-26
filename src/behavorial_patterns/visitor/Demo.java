package behavorial_patterns.visitor;

public class Demo {

    public static void main(String [] args){
        ChessComponent king = new Piece("king", "white");
        ChessComponent blockComponent = new BoardBlock("block", "black", (Piece) king);
        Visitor consoleApplicationVisitor =
                new ConsoleApplicationVisitor();

       king.accept(consoleApplicationVisitor);
       blockComponent.accept(consoleApplicationVisitor);
    }
}
