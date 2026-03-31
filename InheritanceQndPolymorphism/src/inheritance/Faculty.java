package inheritance;

public class Faculty extends Employee{
	public Faculty() {
		System.out.printf("Faculty()%n");
	}

	public static void main(String[] args) {
		new Faculty();
	}
}
