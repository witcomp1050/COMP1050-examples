package welcome;

public class WhileLoop {

	public static void main(String[] args) {
		int x = 1, y = 1;	
		
		while (x<100) {
			x *= 2;			
			y++;
			System.out.printf("%d %d%n", x, y);
		}
		
		System.out.printf("final values: %d %d", x, y);
		
		
		System.out.println();
		System.out.println();
//		
////
		int a = 100, b = 1;		
		while (a<100) {
			a *= 2;			
			b++;	
			System.out.printf("%d %d%n", a, b);
		}
////		
		System.out.printf("final values: %d %d%n", a, b);
////
// Infinite loop - avoid it
//		int c = 10, d = 1;		
//		while (c<100) {
//			c -= 2;	//8, 6, 4, 2, 0, -2, -4, -6 ....	
//			d++;	//2
//			System.out.printf("%d %d%n", c, d);
//		}
//////		
//		System.out.printf("final values: %d %d%n", a, b);
//		
////		
		int i = 0;		
		while (i < 10) {			
			System.out.printf("%d%n", i);
			i++;		
		}

		
	}

}
