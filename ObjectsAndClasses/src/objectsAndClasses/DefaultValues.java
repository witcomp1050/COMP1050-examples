package objectsAndClasses;

public class DefaultValues {
	
	public static int value;
	public static double x;
	
	public static String name;
	public boolean t;

	
	public static void main(String[] args) {
		
//		double y;
//		System.out.println(y);
//		
//		int z;
		
		System.out.printf("%f%n",	x);	
//		
		System.out.printf("%d%n",	name);	
//
		DefaultValues things1 = new DefaultValues();		
//		
////
		System.out.printf("%d%n", things1.value); 
//		
		System.out.printf("%f%n", things1.x); 
		System.out.printf("%d%n", things1.name); 
		System.out.printf("%b%n", things1.t); 
//		System.out.printf("%b%n", things1.z); 
	}
	

}
