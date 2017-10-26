package w3resourceArray;

public class copyArrayByIteration {

	
	public static void copy (int arr[]) {
		for (int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	
	}
	public static void main (String [] args) {
		int ar [] = {1,2,5,8,7,4,5,8,9,6,3,2,5,8,7,4,5,8};
		copy(ar);
	}
}
