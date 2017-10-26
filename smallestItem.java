package w3resourceArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class smallestItem {

	
	
	
	public static int secondSmallest (int arr[])
	{
		//sort the given array from small int to bigger int 
		Arrays.sort(arr);
		// the second small element will be the element after the first element after sorting the array
		int secondSmallest = arr[1];
		//declare var to save the second small element in it to return it 
		int result = secondSmallest ;
		// return the answer
		return result ;
		
	}
	
	public static void main (String [] args) 
	{
		System.out.println("Enter array length");
		Scanner scan = new Scanner (System.in);
		int len = scan.nextInt();
		Random r = new Random ();
		int arr [] = new int [len];
		for (int i = 0 ; i<len ; i++)
		{
			arr[i] = r.nextInt(100);
			System.out.println(arr[i]);
		}
		int result = secondSmallest(arr);
		System.out.println("========================");
		System.out.println("the result is : " + result);
		
	
	}
}
