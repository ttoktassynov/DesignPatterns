package stuctural_patterns.adapter.shape_system;

public class Triangle implements TrianglesInterface{
    private int a, h;
    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
    @Override
    public double getArea() {
        return a * h / 2;
    }
}
