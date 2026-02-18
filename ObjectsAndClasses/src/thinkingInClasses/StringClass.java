package thinkingInClasses;

public class StringClass {
	public static void main(String[] args) {
//		Construction
		String s1 = "Things";
		String s2 = new String("Stuffs");
		String s3 = new String("Things123");
//		Length, Character
		System.out.println(s1.length()); 
		System.out.println(s1.charAt(2));
//		Concatenation
		System.out.println(s1.concat(s2)); // s1 + s2
//		Substring
		System.out.println(s1.substring(2)); // "ings"
		System.out.println(s2.substring(1, 5)); // "tuff"
//		Comparisons
		System.out.println(s1.equals(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		
		

	}

}
