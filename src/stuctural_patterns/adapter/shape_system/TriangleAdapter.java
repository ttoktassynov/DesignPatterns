package stuctural_patterns.adapter.shape_system;

public class TriangleAdapter implements TrianglesInterface{
    private Rectangle rectangle;
    public TriangleAdapter(Rectangle rectangle){
        this.rectangle = rectangle;
    }
    @Override
    public double getArea() {
        return rectangle.getArea();
    }
}
