package w3resourceArray;

import java.util.Arrays;

public class AverageExceptTheLargestAndSmallest {

	
	public static float Average (int arr[]) {
		int sum = 0 ; 
		float average = 0 ;
		int len = arr.length;
		Arrays.sort(arr);
		for (int i = 1 ; i<len-2 ; i++) {
			sum += arr[i];
		}
		
		average = sum / len ;
		return average ;
	}
	
	public static void main (String [] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9,10};
		float av = Average(ar);
		System.out.print("[");
		for (int a = 0 ; a<ar.length-1 ;a++) {
			System.out.print(ar[a]);

			System.out.print(" , ");
		}

		System.out.println("]");
		

		System.out.printf("the average is : %s" , av );
	}
}
