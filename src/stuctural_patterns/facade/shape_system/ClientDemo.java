package stuctural_patterns.facade.shape_system;

public class ClientDemo {
    public static void main(String [] args){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}
