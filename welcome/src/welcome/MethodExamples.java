package welcome;

public class MethodExamples {
	
	public static void main(String[] args) {
		
		
		MethodExamples.sub();
		sub(5);
		sub (18, 3);
//		
		System.out.println(sub (18, 3));
////		
		int c = sub(18, 3)*2;
////		
		System.out.println(c);
		
//		
		int a=1, b=2;		
		System.out.printf("%d %d %d%n", a, a, smallerOf(a, a));		
		System.out.printf("%d %d %d%n", b, b, smallerOf(b, b));			
		System.out.printf("%d %d %d%n", a, b, smallerOf(a, b));			
		System.out.printf("%d %d %d%n", b, a, smallerOf(b, a));
	}
	
	
//	public static int add() { // Error. Must return an int or void
//				
//	}
	
	public static int add() { 
		return 0;		
	}
//	
	public static void sub() {
		System.out.println("this is sub()");		
	}
	
	public static boolean sub2() {
		System.out.println("this is sub()");
		int x = 5;
		if (x == 5) {
			return false;
		}
		else {
			return true;
		}
	}
//	
////	Overloading
	public static void sub(int a) {
		System.out.printf("a is now %d%n%n", a - 7);		
	}
//	
//	
//	public static int sub() { // parameters must change in overloaded methods
//		
//		return 5;
//	}
//	
//	
	public static int sub(int a, int b) {
		return a - b;
	}
//	
//	
//
//	
	public static int smallerOf_(int a, int b) {
		if(a<=b) {
			return a;
		}
		else {
			return b;
			}
		}
//	
//	// using ternary
	public static int smallerOf(int a, int b) {
		return (a <= b)?a:b;
	}


}
