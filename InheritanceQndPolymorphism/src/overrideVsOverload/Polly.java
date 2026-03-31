package overrideVsOverload;

public class Polly {
	
	public static void p(Object o) {
		System.out.printf("%s%n", o.toString());
	}
	

	@Override
	public String toString() {
		return "wants a cracker";
	}


	public static void main(String[] args) {
		p(new Polly());
	}
	

}
