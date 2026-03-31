package vet;

public class Cat {
	final private String name;
	final private String id;
	final private boolean hairBalls;

	public Cat(String name, String id, boolean hairBalls) {
		this.name = name;	
		this.id = id;
		this.hairBalls = hairBalls;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String toString() {
		return String.format("%s (%s)", getName(), getId());
	}		

	public String says() {
		return "meow";
	}

	public boolean hasHairBalls() {
		return hairBalls;
	}


}
