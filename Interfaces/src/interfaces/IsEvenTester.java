package interfaces;

public class IsEvenTester {
	public static void happyOrSad(I1 var) {
		for (int i=0; i<10; i++) {
			System.out.printf("%d :", i);
			if (var.test(i)) {
				System.out.printf(")");				
				} else {
				System.out.printf("(");
			}
			System.out.printf("%n");
		}
	}

	public static void main(String[] args) {
//		happyOrSad(new IsEven());
//		happyOrSad(p->p%2 == 0);
	}
	
	
	public static class IsEven implements I1 {
		@Override
		public boolean test(int p) {
			return p%2 == 0;
		}
	}


}
