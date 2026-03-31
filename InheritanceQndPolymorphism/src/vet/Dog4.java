package vet;

public class Dog4 extends Pet2 {
	public Dog4(String name, String id) {
		super(name, id);
	}

	@Override
	public String says() {
		return "woof";
	}
}
