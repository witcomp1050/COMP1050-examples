package interfaces;

public class Circle implements Measurable, Comparable<Circle>{
	final private double r;

	public Circle(double r) {
		this.r = r;
	}


	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*r;
	}
	


	@Override
	public int compareTo(Circle o) {
		return Double.compare(this.r, o.r);
	}

}
