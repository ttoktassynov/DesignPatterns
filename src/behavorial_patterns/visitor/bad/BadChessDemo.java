package behavorial_patterns.visitor.bad;

public class BadChessDemo {

    public static void main(String [] args){
        Piece king = new Piece("the king", "white");
        ChessComponent boardBlock = new BoardBlock("h2a2", "black", king);
        king.visit();
        boardBlock.visit();
    }
}
