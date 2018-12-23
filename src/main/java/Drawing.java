import java.util.ArrayList;

//this is composite
public class Drawing implements Shape {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void draw(String fillColor) {
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Shape shape) {
        shapes.add(shape);
    }

    //removing shape from drawing
    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        shapes.clear();
    }

}
