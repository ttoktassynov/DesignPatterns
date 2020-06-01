package stuctural_patterns.adapter.shape_system;

public class ShapeSystemDemo {
    public static void main(String [] args){
        TrianglesInterface triangle = new Triangle(10,3);
        TrianglesInterface rectangle = new TriangleAdapter(new Rectangle(2,4));
        System.out.println(triangle.getArea());
        System.out.println(rectangle.getArea());
    }
}
