package stuctural_patterns.bridge.shape_system;

public class Client {
    public static void main(String [] args){
        YellowColor yellow = new YellowColor();
        RedColor red = new RedColor();
        GreenColor green = new GreenColor();

        Shape square = new Square(red, 4);
        Shape rectangle = new Rectangle(yellow, 3, 4);
        square.paintShape();
        rectangle.paintShape();
    }
}
