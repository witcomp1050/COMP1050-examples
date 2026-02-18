package objectsAndClasses;

public class CircleEx2 {
	
	public static void inc(CircleExample c, int x) {
		c.setRadius(c.getRadius()+1);
		x++;
	}

	public static void main(String[] args) {
		CircleExample c = new CircleExample(1);
		int x = 1;

		System.out.printf("%.2f %d%n", c.getRadius(), x);
		inc(c, x);	
		System.out.printf("%.2f %d%n", c.getRadius(), x);
//		
//		
		CircleExample[] circles = new CircleExample[3];
		circles[0] = new CircleExample();
		circles[0].setRadius(5);
		circles[1] = new CircleExample(3);
		
		System.out.println(circles[0].getRadius());
		System.out.println(circles[1].getRadius());		

	}

}
