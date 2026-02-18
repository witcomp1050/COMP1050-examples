package thinkingInClasses;

public class StringExercise1 {
	public static void main(String[] args) {
		final String w = "Welcome";		
		System.out.printf("%s%n", w);
		w.replace('e', 'E');
		System.out.printf("%s%n", w);
//		
		final String w2 = "Welcome2";		
		System.out.printf("%s%n", w2);
		String w3 = w2.replace('e', 'E');
		System.out.printf("%s%n", w3);
		System.out.println(w2.replace('e', 'E'));

	}

}
