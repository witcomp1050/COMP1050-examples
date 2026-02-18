package thinkingInClasses;

public class StringInterning {
	public static void main(String[] args) {
		String s1 = "Things";
		String s2 = new String("Things");
		String s3 = "Things";

		System.out.printf("%b %b%n", s1==s2, s1.equals(s2));
		System.out.printf("%b %b%n", s1==s3, s1.equals(s3));
		System.out.printf("%b %b%n", s2==s3, s2.equals(s3));

	}

}
