package welcome;

public class ParameterHandlingForReference {
	
	public static void change(int[] a) {
		a[0]--;
	}		

	public static void main(String[] args) {
		int[] x = {10};
		System.out.printf("before: %d", x[0]);
		change(x);
		System.out.printf(", after: %d%n", x[0]);	
	}


}
