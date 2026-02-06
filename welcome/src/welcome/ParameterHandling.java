package welcome;

public class ParameterHandling {
	
	public static void change(int a) {		
		a--;	
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.printf("before: %d", x);
		change(x);
		System.out.printf(", after: %d%n", x);	
		
		int b =5;
		
		if (x == 5) {
			int y = 2;
			b = y *2;
			System.out.println(y);			
		}
////		
		System.out.println(b);
		
//		System.out.println(y); // y cant be accessed outside of its scope
	}
	


}
