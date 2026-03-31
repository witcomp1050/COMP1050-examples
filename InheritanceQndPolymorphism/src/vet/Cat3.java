package vet;

public class Cat3 extends Pet{
	final private boolean hairBalls;

	public Cat3(String name, String id, 
			 boolean hairBalls) {
		super(name, id);
		this.hairBalls = hairBalls;
	}

	@Override
	public String says() {
		return "meow";
	}


}
