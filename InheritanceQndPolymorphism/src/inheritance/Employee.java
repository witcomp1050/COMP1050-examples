package inheritance;

public class Employee extends Person{
	public Employee() {	
		this("Employee(s)");
		System.out.printf("Employee()%n");
	}

	public Employee(String s) {
		System.out.printf("%s%n", s);
	}


}
