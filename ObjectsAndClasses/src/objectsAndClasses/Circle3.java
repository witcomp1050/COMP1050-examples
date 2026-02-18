package objectsAndClasses;

public class Circle3 {
	private double radius = 1.0;
	
//
	public Circle3() {
		this(1.0);		
	}
//
	public Circle3(double r) { 
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
