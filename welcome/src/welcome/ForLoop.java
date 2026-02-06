package welcome;

public class ForLoop {
	public static void main(String[] args) {
		
//		while loop example
		int i=0;		
		while (i<10) {			
			System.out.printf("%d%n", i);
			i++;		
		}
		
//		for loop equivalent
		for (int j = 0; j < 10; j++) {
			System.out.printf("%d%n", j);
		}	
		
////	print even numbers from 0 to 9
		for (int j = 0; j < 10; j+=2) {
			System.out.printf("%d%n", j);
		}	
	}

}
