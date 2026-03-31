package vet;

 abstract public class Pet2 {
	final private String name;
	final private String id;

	public Pet2(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}		

	@Override
	public String toString() {
		return String.format("%s (%s)", getName(), getId());	
	}
	
	abstract public String says();
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pet2) {
			final Pet2 p = (Pet2) obj;
			return this.id.equals(p.id);
		} else {	
			return false;
		}
	}


}
