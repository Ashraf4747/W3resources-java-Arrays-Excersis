package w3resourceArray;

import java.util.ArrayList;

public class findEvenAndOdd {

	
	
	
	
	public static void findOddAndEvenNumbers (int arr [] ) 
	{
		ArrayList <Integer> even = new ArrayList <Integer>();
		ArrayList<Integer> odd = new ArrayList <Integer>();
		for (int i = 0 ; i<arr.length ; i++) {
			if (arr[i]%2==0) {
				even.add(arr[i]);
			}
			else if (arr[i]%2 == 1) {
				odd.add(arr[i]);
			}
			else {
				System.out.println("no number");
				
			}
		}
		System.out.println("even number are : " + even);
		System.out.println();
		System.out.println("odd number are : " + odd);
		
		
	}
	public static void main (String [] args) {
		int ar [] = {11,12,13,14,15,16,17,18,19,20,21};
		findOddAndEvenNumbers(ar);
		
	}
}
