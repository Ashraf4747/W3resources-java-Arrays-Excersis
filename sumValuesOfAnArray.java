package w3resourceArray;

import java.util.Scanner;

public class sumValuesOfAnArray {
	
	static Scanner scn ;
	
	
	//sum method
	static public  int sumArray (int [] arr) {
		//initial int sum 
		int sum = 0 ;
		//loop through and add every index to sum
		for (int i = 0; i<arr.length ;i++) {
			sum += arr[i];
			
		}
		// return sum
		return sum ;
	}
	
	
	
	
	public static void main(String[] args) {
		scn = new Scanner (System.in);
		//get Array length from User
		System.out.println("Array length");
		int len = scn.nextInt();
		// declare array , 
		int Arr [] = new int [len];
		//loop to get index from user
		for (int a = 0 ; a<len ; a++) {
			
			//store index in array
			Arr[a] = scn.nextInt();
		}
		//return sum from sumArray method
		int sum = sumArray (Arr);
		//output
		System.out.println("your array sum is : " + sum);
	}

}
