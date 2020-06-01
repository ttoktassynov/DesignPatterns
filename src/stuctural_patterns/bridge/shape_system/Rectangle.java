package stuctural_patterns.bridge.shape_system;

public class Rectangle extends Shape{
    private int width, height;
    public Rectangle(Color color, int width, int height){
        super(color);
        this.width = width;
        this.height = height;
        this.shapeType = "rectangle";
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
