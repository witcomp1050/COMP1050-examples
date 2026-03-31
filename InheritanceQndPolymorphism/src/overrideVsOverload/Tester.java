package overrideVsOverload;

public class Tester {
	public static void main(String[] args) {
		final Object o1 = new C1();	
		final Object o2 = new C2();
		final Object o3 = new C3();		
		System.out.printf("%s%n%s%n%s%n", o1, o2, o3);
	}

}
