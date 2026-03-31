package vet;

public class Sub extends Super{
	
	public Sub() {
		this("");
		System.out.printf("Sub()%n");
	}
	
	public Sub(String s) {
//		super();
		System.out.printf("Sub(s)%n");
	}


	public static void main(String[] args) {
		new Sub();
		
		new Sub("");
	}

}
