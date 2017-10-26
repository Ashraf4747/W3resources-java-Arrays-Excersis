package w3resourceArray;

public class sumTwoIntegerEqualTogiverInt {

	public static void sum (int arr[] , int n1) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			for(int q = 0 ; q<arr.length ; q++) {
				if (arr[i]+arr[q]==n1) {
					System.out.println(arr[i] +" + "+ arr[q] + " are equal to "+ n1);
				}
			}
		}
	}
	public static void main (String [] args) {
		int ar [] = {1,2,3,4,5};
		sum(ar , 6);
	}
}
