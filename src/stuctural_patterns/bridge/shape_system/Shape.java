package stuctural_patterns.bridge.shape_system;

public abstract class Shape {
    protected Color color;
    protected String shapeType;

    public Shape(Color color){
        this.color = color;
    }

    public abstract int getArea();

    public void paintShape(){
        System.out.println("The shape of type " +
                this.shapeType + " " + this.color.fillColor());
    }
}
