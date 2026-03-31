package overrideVsOverload;

public class B extends A{
	
    // overloading     
	public int f(double x) {
		return (int) (2 * x);
	}

	public static void main(String[] args) {
		final B b = new B();
		System.out.printf("%d %d%n",b.f(10), b.f(10.0));
	}


}
