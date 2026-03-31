package objectsAndClasses;

public class RegularExpression {
	public static void main(String[] args) {
		String s1 = "Java is fun";
		String s2 = "Java is cool";
		
		System.out.println(s1.matches("Java.*")); //true
		System.out.println(s2.matches(".*ava")); //false
		
		
		System.out.printf("a+b$#c%n".replaceAll("[$+#]", "NNN"));



			for (String s : "a,b;c".split("[,;]")) {
				System.out.printf("%s%n", s);
			}
//
	}
			

}
