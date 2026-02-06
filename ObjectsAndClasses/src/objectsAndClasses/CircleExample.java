package objectsAndClasses;

public class CircleExample {
	
	private double radius = 1.0;
	
//
	public CircleExample() {
		
	}
//
	public CircleExample(double r) { 
		setRadius(r);
	}
	
	public double getRadius() { 
		return radius;
	}
	
	public void setRadius(double r) { 
		if (r>0) 	{
			radius = r;
			}
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
