package w3resourceArray;

import java.util.Arrays;

public class secondBiggestItem {

	
	public static int secondBigger(int arr[]) 
	{
		//sort the given array 
		Arrays.sort(arr);
		//the second biggest element will be the element before the last element in array 
		int secondBigger= arr[arr.length-2];
		// return output 
		return secondBigger ;
		
	}
	
	
	
	
	public static void main (String [] args)
	{
		//simple test array
		int ar [] = {10,20,30,40,50,60};
		//declare int to save the secondBigger element in array
		
		int result = secondBigger (ar);
		//output result of the second bigger element in any array 
		System.out.println(result);
		
		
	}
}
