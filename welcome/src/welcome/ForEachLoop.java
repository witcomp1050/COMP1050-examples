package welcome;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] phone = {8, 6, 7, 5, 3, 0, 9};
		
		for (int x : phone) {			
			System.out.printf("%d%n", x);
		}
		System.out.printf(" Jenny%n");

		int[] computers = {6, 7, 3, 0, 4, 5, 3};
//		
		int[] totals = new int[7];
//		
		for (int y = 0; y < totals.length; y++) {	
			totals[y] = phone[y] + computers[y];
			System.out.printf("totals for store %d = %d%n", y, totals[y]);
		}
	}

}
