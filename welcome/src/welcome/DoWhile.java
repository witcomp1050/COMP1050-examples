package welcome;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int x;	
		int y;
		Scanner s = new Scanner(System.in);	
		

		do {			
			System.out.printf("Enter 1 to loop: ");	
			x = s.nextInt(); 
		} while (x == 1);		
		System.out.printf("Freedom!%n");
		
		
		
		
	}
}
