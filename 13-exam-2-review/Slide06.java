import java.util.List;

public class Slide06 {
    interface Shape { double area(); }
    record Square(double side) implements Shape { public double area() { return side * side; } }
    record Circle(double r) implements Shape { public double area() { return Math.PI * r * r; } }
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Square(2), new Circle(1), new Square(3));
        double total = 0;
        for (Shape s : shapes) total += s.area();
        System.out.printf("%.2f%n", total);
        System.out.println(shapes.get(1) instanceof Circle c ? "radius " + c.r() : "not a circle");
    }
}
