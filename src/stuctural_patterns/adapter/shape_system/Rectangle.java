package stuctural_patterns.adapter.shape_system;

public class Rectangle implements RectangleInterface{
    private int height, width;
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public int getArea() {
        return height * width;
    }
}
