package welcome;

public class FormattedOutpout {
	public static void main(String[] args) {
		int x = 2;
		int y = 237647617;
		
		System.out.println("Welcome Java!");
		System.out.println("Hello world! Welcome to Java " + x + "! Welcome");
//		
		System.out.printf("Hello world!%nWelcome to Java%n");
//
		System.out.printf("Hello world!%nWelcome to Java%d", x);
//		
		System.out.printf("Hello world!%nWelcome to Java%d%n%s", x, "Thanks!");
		System.out.printf("Hello world!%nWelcome to Java %+d%n", x);
////		
		System.out.printf("Hello world!%nWelcome to Java%+d", x);
////		
		System.out.printf("Total amout is: $%,d%n", y);
////			
		System.out.printf("Total amout is: $%f%n", (float)y);
////		
		System.out.printf("Total amout is: $%.2f%n", (float)y);
////		
////		
		String finalAmount = String.format("Final amout is: $%.2f%n", (float)y *2.0);
////
		System.out.println(finalAmount);
	}

}
