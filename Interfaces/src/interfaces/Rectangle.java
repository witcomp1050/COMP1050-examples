package interfaces;

public class Rectangle implements Measurable{
	
	final private double h;
	final private double w;

	public Rectangle(double h, double w) {
		this.h = h;
		this.w = w;
	}

	
	@Override
	public double getArea() {
		return h*w;
	}

	@Override
	public double getPerimeter() {
		return 2*(h + w);
	}
	
	

}
