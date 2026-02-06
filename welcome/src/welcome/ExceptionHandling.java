package welcome;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int inputValue = 0;
		
//		Without try-catch
//		System.out.printf("Enter an integer: ");
//		int inputValue = input.nextInt();
//		System.out.println(inputValue);
		

			try {
				System.out.printf("Enter an integer: ");
				inputValue = input.nextInt();//			
				System.out.println("Method returns " + readInt(input));			
			} 
			catch (InputMismatchException ex) {
				System.out.printf("Error! Integer required!%n");
				System.exit(0);
			}
	
		System.out.printf("%d^2=%d%n", inputValue, inputValue*inputValue);

//		Using method call
//		System.out.println("Method returns " + readInt(input)); //must be in try-catch


	}
	
	public static int readInt(Scanner s) throws InputMismatchException {
		System.out.print("Enter an integer for this method: ");
		return s.nextInt();
	}


}
