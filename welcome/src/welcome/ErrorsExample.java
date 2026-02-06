package welcome;

public class ErrorsExample {

	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		
//		Runtime error
		System.out.println(1 / 0);
		System.out.println("Welcome again to Java");

//		logical error
		int length = 3;
		int width = 5;
		int area = length + width;
		System.out.println(area);

		}

}
