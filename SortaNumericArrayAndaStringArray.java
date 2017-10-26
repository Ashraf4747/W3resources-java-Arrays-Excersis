package w3resourceArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortaNumericArrayAndaStringArray {
	static Scanner scn = new Scanner (System.in);
	
	
	
	
	
	
	public static void main (String [] args) {   
		//get Array length 
		System.out.println("Array length");
		int len = scn.nextInt();
		//set array length
		int arr [] = new int [len];
		//get random data 
		Random r = new Random ();
		//loop and stor data between 0 and 100 in array 
		for (int i = 0 ; i<arr.length ; i++) {
			arr[i] = r.nextInt(100);
			//output array
			System.out.print(arr[i] + "  ");
		}
		//blanck line 
		System.out.println("");
		//sort Arrays data 
		Arrays.sort(arr);
		// loop through array and output 
		for (int a = 0 ; a<arr.length ; a++) {
			System.out.print(arr[a] + " ");
		}
		//blanck line
		System.out.println();
		//set Array Of String 
		String e [] = {"e","d","c","b","a"};
		//loop through String and output data
		for (int q =0 ; q<e.length ;q++) {
			Arrays.sort(e);
			System.out.print(e[q] + " ");
			
		}
	
	}
		
		
}
