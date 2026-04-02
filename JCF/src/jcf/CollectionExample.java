package jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionExample {
	public static void main(String[] args) {
		final Collection<String> c = new ArrayList<>();
		System.out.println(c);
		c.add("New York");
		System.out.println(c);
		c.add("Atlanta");
		c.add("Dallas");
		c.add("Madison");
		System.out.println(c);
		System.out.println(c.size());
		
	

		
		final Iterator<String> i = c.iterator();
		while(i.hasNext()) {
			System.out.printf("%s ", i.next());
		}
		System.out.printf("- done!%n");
		
		System.out.println("=========================");
//		
//		
		final Collection<String> c2 = new ArrayList<>();
		c2.add("Boston");		
		c2.add("Roxbury");
		System.out.println(c2);
//		
		c.addAll(c2);
		System.out.println(c);
//		
		final Iterator<String> i2 = c.iterator();
		while(i2.hasNext()) {
			System.out.printf("%s ", i2.next().toUpperCase());
		}
		System.out.printf("- done!%n");
//		
//		
		System.out.println("Exercise");
		final Collection<String> myCollection = new ArrayList<>();
		myCollection.add("Pineapple");
		myCollection.add("Banana");
		myCollection.add("Orange");
		myCollection.add("Apple");
		myCollection.add("Watermelon");
//		
		final Iterator<String> myIterator = myCollection.iterator();
		while(myIterator.hasNext()) {
			final String str = myIterator.next();
			if (str.toLowerCase().contains("an")) {
				System.out.printf("%s%n", str);
			}
		}
//
//		Set<String> set = new HashSet<>();
//		set.add("apple");
//		set.add("banana");
//		set.add("apple"); // Duplicate, ignored
//
//		System.out.println(set); // Output: [banana, apple] (order may vary)

		
	}

}
