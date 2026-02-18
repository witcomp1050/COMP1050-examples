package objectsAndClasses;

public class TestCircle {
	public static void main(String[] args) {
		
		CircleExample c1 = new CircleExample(5);
		
		CircleExample c2 = new CircleExample(10);
		CircleExample c3 = new CircleExample(5);
//		
		CircleExample c4 = new CircleExample();
		
		System.out.println("c1 ref is: " + c1); // prints reference
//		
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		System.out.println("area of c2 is: " + c2.getArea());
////
//		
		CircleExample cA = new CircleExample(5.0);
		CircleExample cB = new CircleExample();
		System.out.println(cB.getRadius());
		cB.setRadius(100);
		System.out.println(cB.getRadius());
		System.out.println(cA.getRadius());
//
//		
//		
//////		null pointer exception
		CircleExample c5 = null;
////		
//		System.out.printf("%s%n", c5); 
//		System.out.printf("%d%n", c5.getRadius());// NullPointerException
////		
//		
		System.out.println(cA);
	}
}
