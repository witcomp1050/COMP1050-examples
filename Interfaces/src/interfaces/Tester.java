package interfaces;

public class Tester {
	public static void main(String[] args) {
		Drawable d = new Rose();
		d.draw();
		
		System.out.println("------------------");
//		
		Rectangle r1 = new Rectangle(3.5, 5.0);
		Circle c1 = new Circle(4);
////		
		System.out.println("the rectangle area is: " + r1.getArea());
		System.out.println("the rectangle perimeter is: " + r1.getPerimeter());
////		
////
		System.out.println("the circle area is: " + c1.getArea());
		System.out.println("the circle perimeter is: " + c1.getPerimeter());
//		
//		
		System.out.println("==================");
		
		System.out.printf("%d%n",c1.compareTo((Circle) new Circle(4)));

	}
}
