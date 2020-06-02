package stuctural_patterns.facade.shape_system;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("cannot draw a triangle");
    }
}
