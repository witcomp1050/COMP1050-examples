package overrideVsOverload;

public class D extends C {
	// overriding
     public int f(double x) {
		return (int) (2 * x);
	}

	public static void main(String[] args) {
		final D d = new D();
		System.out.printf("%d %d%n",d.f(10), d.f(10.0));
	}
}
