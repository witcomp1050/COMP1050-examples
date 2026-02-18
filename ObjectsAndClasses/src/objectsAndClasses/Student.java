package objectsAndClasses;

public class Student {
	public String lastName;
	public int age;
	public boolean isScienceMajor;
	public char firstInitial;
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.lastName);
		System.out.println(s.age);
		System.out.println(s.firstInitial);
		System.out.println(s.isScienceMajor);
	}

}
