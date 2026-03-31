package generics;

public class Foo {
//	public static double sum(MutableObject<Number> a, MutableObject<Number> b) {
//		return a.get().doubleValue() + b.get().doubleValue();
//	}
//	
////	solution:
		public static double sum(MutableObject<? extends Number> a, MutableObject<? extends Number> b) {
			return a.get().doubleValue() + b.get().doubleValue();
		}

		public static void main(String[] args) {
			final MutableObject<Integer> i1 = new MutableObject<>(1);
			final MutableObject<Integer> i2 = new MutableObject<>(2);

			System.out.printf("%.3f%n", sum(i1, i2));
			
		}
		
		



		
	
}
