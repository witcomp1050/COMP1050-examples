package welcome;

public class Conditionals {
	


	public static void main(String[] args) {
	
		
		double minGrade = 60;
		double grade = 59.5;
		double perfectAtendance = 3.0;
		double studAttendance = 3.0;
		
		if(grade >= minGrade) {
			System.out.println("You're welcome to stay");
		}
		
		else if (studAttendance == perfectAtendance) {
			System.out.println("You may stay for now");			
		}
//		
		else {
			System.out.println("You can't stay");
		}
//		
		boolean a = false;
		int x = 4;
		int y = 7;
////		
////		prints that's true
		if(true) {
			System.out.println("that's true");
		}
//		
////		no output
		if(false) {
			System.out.println("that's false"); // can't print
		}
////		
		if(a) {
			System.out.println("that's false"); // can't print
		}
////		
////		 with else
		if(a) {
			System.out.println("that's false");
		}
		else {
			System.out.println("that's true");
		}
////		
////		if... else if... else
		if(a) {
			System.out.println("that's true");
		}
		
		else if (x == 4) {
			System.out.println("that's 4");
		}
//			
		else {
			System.out.println("that's false");
		}
////		
////		
		if (a = true) {
			System.out.println("that's something");
		}
////		
		if (a) {
			System.out.println("a is true now"); // a changed to true
		}
////		
//////	prints nothing	
		boolean b = false;		
		if (b = false) {			
			System.out.printf("foo");		
		}
////		prints nothing			
		if (b == true) {			
			System.out.printf("bar");		
		}
////		
////	prints bar2
		if (b = true) {			
			System.out.printf("bar2");		
		}
		
		if (x == 4) {	// compare to if (x = 4)		
			System.out.printf("bar2"); 		
		}
////
////		System.out.println();
////		
////		
//		ternary operator
	
		int c = 10, d;
//		
		if (c%2 == 0) {			
			d = 1;		
		} else {			
			d = 0;		
		}
////		
		System.out.printf("%n%d%n",d);
////
////		using ternary operator
		d = (c%2 == 0) ? 1 : 0 ;
		System.out.printf("%n%d%n", d);


	}

}
