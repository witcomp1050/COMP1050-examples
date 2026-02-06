package welcome;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] fruits;
		
		fruits = new int[5];
		
		System.out.println(fruits);
		
		System.out.println(fruits[1]);
		
		fruits[0] = 5;
		fruits[1] = 15;
		fruits[2] = 8;
		System.out.println(fruits[1]);
		System.out.println(fruits[4]);
//		System.out.println(fruits[5]); //ArrayIndexOutOfBoundsException
		
		int[] fruits2 =  {7, 25, 20, 20, 10};



		
		
		int[] counts = new int[5];
		boolean[] tf = {false, true};

		System.out.printf("%d %d%n", counts.length, tf.length);
////		
		System.out.println(counts);
		System.out.println(counts[2]);
//		System.out.println(counts[5]); //ArrayIndexOutOfBound exception
////		
////
		int[] a = {5, 4, 3, 2, 1};		
		int x = 2;	
////		
		System.out.printf("%d %d %d %d %d",	a[3], a[x], a[x/2], a[x+x], a[x-2]);
////
////	Multidimensional array
////
///
//		int[][] stocks = new int[4][4];
		
		int[][] stocks = {{4,2,3,2,2}, {0,1,3,4,5}, {0,0,0,0,0}, {1,1,1,1,1}};
		
		int[][] m1;		
		m1 = new int[][] {{1, 2}, {3, 4}, {5, 6}};
////
		int[][] m2 = new int[3][];
		m2[0] = new int[] {1, 2};
		m2[1] = new int[] {3, 4};
		m2[2] = new int[] {5, 6};
////
		int[][] m3 = new int[3][2];		
		m3[0][0] = 1;		
		m3[0][1] = 2;		
		m3[1][0] = 3;		
		m3[1][1] = 4;		
		m3[2][0] = 5;	
		m3[2][1] = 6;
//		
		System.out.println();
		System.out.println(m3[2][0]);
		m3[2][0] -=  1; 
		
	}

}
