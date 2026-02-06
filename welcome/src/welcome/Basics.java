package welcome;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		int x;		
		x = 6; // separate line assignment
//		
		System.out.println(x);
//
//		
		double y = 6.7; // same line assingment
////		
		x = 8;
////		
		final int nStudents = 6;
////		
//		nStudents = 7; // can't change the value of a final variable
////	
//		power function
////		
		double power = Math.pow(x, nStudents); 
		System.out.println(power);
////		
//	Convert fahrenheit to celsius		
		   Scanner input = new Scanner(System.in);
////
		    System.out.print("Enter a degree in Fahrenheit: ");
		    double fahrenheit = input.nextDouble(); 
////
////		    // Convert Fahrenheit to Celsius
		    double celsius = (5.0 / 9) * (fahrenheit - 32);
		    System.out.println("Fahrenheit " + fahrenheit + " is " + 
		      celsius + " in Celsius");
//	
	}

}
