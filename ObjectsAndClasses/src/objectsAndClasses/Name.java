package objectsAndClasses;

public class Name {
	
	final private String fName;
	final private String lName;

	public Name(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	

	public static void main(String[] args) {
		Name javaInventor = new Name("James", "Gosling");

		System.out.printf("Java was invented by %s.%n", javaInventor);
	}
	
	public String toString() {
		return String.format("%s %s", fName, lName);
	}

	
}
