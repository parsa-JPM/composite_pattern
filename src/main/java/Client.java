import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Blue");

        drawing.clear();

        drawing.add(new Circle());

        drawing.draw("Green");
    }
}
