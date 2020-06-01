package stuctural_patterns.bridge.shape_system;

public class Square extends Shape {
    private int sideLength;
    public Square(Color color, int sideLength){
        super(color);
        this.sideLength = sideLength;
        this.shapeType = "square";
    }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}
