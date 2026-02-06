package welcome;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("enter an integer:");
	int integerNumber = userInput.nextInt();	
	System.out.println(integerNumber);
//	
	System.out.println("enter an double:");
	double doubleNumber = userInput.nextDouble();	
	System.out.println(doubleNumber);
//	
//	
	System.out.println("enter a string (next() example):");
	String stringValue1 = userInput.next();	
	System.out.println(stringValue1);
//	
	System.out.println("enter a string (nextLine() example):");
	String stringValue2 = userInput.nextLine();	
	System.out.println(stringValue2);

	
//	
//	
//	userInput.close();
	
	}
}
