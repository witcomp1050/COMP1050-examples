package thinkingInClasses;

public class WrapperClasses {
	public static void main(String[] args) {
		
		System.out.printf("%d%n", Integer.parseInt("14"));
		System.out.printf("%d%n", Integer.parseInt("14", 10));
		System.out.printf("%d%n", Integer.parseInt("14", 16));
////		
		Double x = new Double("14.1");
////		
		System.out.printf("%d%n", x.intValue());

	}

}
