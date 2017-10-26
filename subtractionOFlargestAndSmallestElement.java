package w3resourceArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class subtractionOFlargestAndSmallestElement {

	
	
	
	public static int diff(int arr[]) {
		
		
		
		Arrays.sort(arr);
		int last = arr[arr.length-1];
		int diffirence = last - arr[0];
		
		return diffirence;
	}
	
	
	public static void main (String [] args) {

		int ar[]= {10,25,480,75,250,9};
		int result = diff(ar);
		System.out.println(result);
	}
}
