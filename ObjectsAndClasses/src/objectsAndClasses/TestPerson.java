package objectsAndClasses;

public class TestPerson {
	public static void main(String[] args) {
		Person a = new Person(); 
		
		System.out.printf("A: %s%n", a.getBorgId());
		System.out.printf("Peeps: %d%n", Person.getNumPeople());
		
		Person b = new Person(); 
		
		System.out.printf("A: %s%n", b.getBorgId());
		System.out.printf("Peeps: %d%n", Person.getNumPeople());
//		
		System.out.printf("Peeps: %d%n", a.getNumPeople());



	}
}
