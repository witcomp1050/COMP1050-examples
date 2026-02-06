package welcome;

public class SearchArray {
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 4, 3, 0, 3};		
		System.out.println(searchArray(arr, 0));
		System.out.println(searchArray(arr, 7));		
	}



	public static int searchArray(int[] haystack, int needle) {
		for (int i=0; i<haystack.length; i++) {
			if (haystack[i] == needle) {
				return i;
			}
		}
		return -1;
	}

}

