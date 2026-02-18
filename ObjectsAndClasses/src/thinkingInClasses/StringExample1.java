package thinkingInClasses;

public class StringExample1 {
	
public static void main(String[] args) {
	System.out.printf("%s%n", 	"Welcome".replace('e', 'E'));
	System.out.printf("%s%n", 	"Welcome".replaceFirst("e", "EE"));
	System.out.printf("%s%n", 	"Welcome".replaceAll("e", "EE"));
	System.out.printf("%s%n", 	"Welcome".replaceFirst("el", "EE"));

}

}
