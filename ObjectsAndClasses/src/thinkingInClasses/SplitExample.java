package thinkingInClasses;

public class SplitExample {
	public static void main(String[] args) {
		String myString = "Hello, world, hi there!";
		
		String[] splitted = myString.split(", ");
//		
		for (String s : splitted) {
			System.out.println(s);
		}
//		
		for (String s : myString.split(" ")) {
			System.out.println(s);
		}
	}

}
