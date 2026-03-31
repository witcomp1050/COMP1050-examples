package vet;

public class Vet {
	public static void main(String[] args) {
		Dog[] dogs = {
				new Dog("Spot", "1234"),
				new Dog("Rover", "6789")
			};

			Cat[] cats = {
				new Cat("Mittens", "5432", true),
				new Cat("Garfield", "8765", false)
			};

			for (Dog d : dogs) {
				System.out.printf("%s says '%s'%n", d, d.says());
			}

			for (Cat c : cats) {
				System.out.printf("%s says '%s'", c, c.says());
				if (c.hasHairBalls()) {
					System.out.printf(" :: CLEARS THROAT ::");
				}
				System.out.printf("%n");
			}
			
			
			Cat2 c = new Cat2("Burton", "10000", false);
			Cat2 c2 = new Cat2("Bunny", "10002", false);
			System.out.printf("%s%n", c);
			System.out.printf("%b%n", c.hasHairBalls());			
			System.out.printf("%s%n", c2);
			System.out.printf("%b%n", c2.hasHairBalls());
//////			
			Dog2 d = new Dog2("Smart", "11111");
			Dog2 d2 = new Dog2("Champ", "11102");
			System.out.printf("%s%n", d);
			System.out.printf("%s%n", d2);
//			
////			
			System.out.println(c.getName());
////			
			System.out.println(c.says());
			System.out.println(d.says());
////			
			Dog3 d3 = new Dog3("Smile", "111");
			
			System.out.println(d3.says());
			
////			
//			System.out.println(d3);
////			
////			
			Pet p = new Pet("WhatAmI?", "-1");
			
//////
//		Pet2 p2 = new Pet2("WhatAmI?", "-1"); // cant make an instance of abstract class
////////
			Dog4 d5 = new Dog4("xyz", "111");
			System.out.println(d5);
//////			
			Pet2 d6 = new Dog4("xyz", "111");
//////			
			Object d7 = new Dog4("", "");
			
//			String d8 = (String)d7; //causes excepotion at runtime
//			System.out.println(d8);

			// instanceof example
//			if (d7 instanceof String) {
//			Object d8 = (String)d7; //causes excepotion at runtime
//			System.out.println(d8); 
//			}
//////			
			Object s1 = "ProfYetty";
//			String s2 = s;
////			
//			String s3 = s;
//			
			System.out.println("=======================");
//			
			Pet2[] pets = {
					new Dog4("Jake", "000"),
					new Dog4("Smith", "001"),
					new Cat4("Garfield", "003", false),
					new Cat4("Jay", "004", true),
			};
//			
//			
			for (Pet2 pp : pets) {
				System.out.println(pp);
				System.out.printf("%s says '%s'%n", pp, pp.says());
				}
//			
			
			for (Pet2 pp : pets) {
				System.out.println(pp);
				System.out.printf("%s says '%s'%n", pp, pp.says());
				
				if (pp instanceof Cat4) {
					final Cat4 cc = (Cat4) pp;
					if (cc.hasHairBalls()) {	
						System.out.printf(" :: CLEARS THROAT ::");
					}
				}
				System.out.printf("%n");
//
//
			}
//			
//			System.out.println("=======================");
////			
			final Dog4 dd1 = new Dog4("dd1", "1");
			final Dog4 dd2 = new Dog4("dd2", "2");
			final Dog4 lost = new Dog4("?", "1");				
			System.out.printf("%b%n", 	dd1.equals(d2));
			System.out.printf("%b%n", 	dd1.equals(lost));
			System.out.printf("%b%n", 	dd2.equals(lost));
//
//			
	}

}
