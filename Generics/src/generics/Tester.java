package generics;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		MutableObject s = new MutableObject();	
		
		
		MutableObject<String> s2 = new MutableObject<>();	
		
		System.out.printf("%s%n", s); // null
		s.set("hi");
		s.set(2);
		System.out.printf("%s%n", s); // hi
//		
		s2.set("hey");
		System.out.println(s2);
//		
//		s2.set(2); //  error detection at compile time
//		
		s.set("bye");	
		System.out.printf("%s%n", s); // bye
////
		MutableObject<Integer> x = new MutableObject<>(5);
		System.out.printf("%s%n", x); // 5
		x.set(10);
		System.out.printf("%s%n", x); // 10
//		x.set("8"); // error
////		
//		
		System.out.println("=======================");
////		
////		
		Pair<String, String> fb = new OrderedPair<>("Foo", "Bar");
		System.out.printf("%s%s%n", fb.getKey(), fb.getValue());   // FooBar
////		
////		
////		System.out.println("=========================");
////		
		Pair<String, Integer> balances = new OrderedPair<>("Alice", 10);
		System.out.println(balances.getKey());
		System.out.println(balances.getValue());
		
//		
//		Pair<String, List<Double>> balances = new OrderedPair<>("Alice", new ArrayList<Double>());
//		balances.getValue().add(2.7);
//		balances.getValue().add(3.14);
		
	}

}
