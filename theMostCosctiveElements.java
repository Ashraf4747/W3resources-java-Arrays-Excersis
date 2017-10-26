package w3resourceArray;

import java.util.Arrays;

public class theMostCosctiveElements {

	
	
	
	public static void mostConsictive(int arr[]) {
		Arrays.sort(arr);
		int length = 0 ;
		for (int i = 1 ;i<arr.length-1 ; i++)
		{
		  if (arr[i]-arr[i-1] == 1) 
		  {
			length++;
		  }
		}
		System.out.println("consicutive element");
		for (int a = 0 ;a<length ; a++) {
			System.out.println(arr[a]);		
	}
}
	public static void main (String []args) {
		int ar[]= {10,54,75,1,24,58,2,14,58,3,5,7,87,8,98,6};
		Arrays.sort(ar);
		for (int i = 1 ;i<ar.length-1 ; i++) {
			System.out.println(ar[i]);		

		}
		
		mostConsictive(ar);
	}
	
	
	
}