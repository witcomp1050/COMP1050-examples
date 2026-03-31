package vet;

public class Cat4 extends Pet2 {
	final private boolean hairBalls;

	public Cat4(String name, String id, 				 boolean hairBalls) {
		super(name, id);
		this.hairBalls = hairBalls;
	}

	@Override
	public String says() {
		return "meow";
	}

	public boolean hasHairBalls() {
		return hairBalls;
	}
}


