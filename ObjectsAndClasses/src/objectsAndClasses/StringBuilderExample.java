package objectsAndClasses;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		sb.append("Welcome");
		System.out.println(sb);
		sb.append(' ');
		sb.append("to");
		sb.append(' ');
		sb.append("Java!");
////
		System.out.printf("%s%n", sb); 	// Welcome to Java!
////		
		sb.insert(11, "HTML and "); 
		System.out.printf("%s%n", sb);// Welcome to HTML and Java!
////		
		sb.delete(8, 11); 
		System.out.printf("%s%n", sb); // Welcome HTML and Java!
////		
		sb.deleteCharAt(sb.length()-1); 
		System.out.printf("%s%n", sb); // Welcome HTML and Java
////		
		sb.reverse(); 
		System.out.printf("%s%n", sb);// avaJ dna LMTH emocleW
////		
		sb.reverse().replace(8, 16, "HTML");
		System.out.printf("%s%n", sb);// welcome HTML Java
////		
		sb.setCharAt(0, 'w'); 
		System.out.printf("%s%n", sb);// welcome HTML Java
	}

}
