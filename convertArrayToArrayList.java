package w3resourceArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class convertArrayToArrayList {

	
	//another way 
	public static void con () {
		String [] str = {"as","df","gh"};
		ArrayList <String> list = new ArrayList <String>(Arrays.asList(str));
		System.out.println(list);
	}
	
	public static void convert (int arr[])
	{
		// make a new array list
		ArrayList l = new ArrayList ();
		//loop and add element 
		for (int i = 0 ;i<arr.length ; i++) 
		{
			//    index   element
			//      |        |
			l.add(  i  ,  arr[i] );
			
		}
		
		// ouput l element 
		System.out.println(l);
	}
	public static void main (String [] args) {
		//simple array 
		//int ar [] = {1,2,3,4,5,6,7,8,9};
		
		//if  random array 
		  Random r = new Random();
		  Scanner scan = new Scanner (System.in);
		  System.out.println("Array length");
		  int len = scan.nextInt();
		  int arr []=new int [len];
		  for (int i = 0 ; i<arr.length ; i++){
		  		arr[i] = r.nextInt(10);
		  }
		  //if sort 
		  Arrays.sort(arr);
		  convert(arr);
		  con();
		 
		
		
	}
}
