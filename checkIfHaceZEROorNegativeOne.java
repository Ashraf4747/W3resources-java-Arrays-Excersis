package w3resourceArray;

import java.io.Console;

public class checkIfHaceZEROorNegativeOne {

	
	
	public static boolean check (int arr[]) {
		int len = arr.length;
		boolean check = false ;
		for (int i = 0 ; i<len-1 ; i++) {
			if (arr[i] == 0 || arr[i] == -1) {
				
				check = true;
			}
			
		}
		
		return check;
	}
	
	public static void main (String [] args) {
		int ar [] = {2,10,7,5};
		boolean c = check (ar);
		System.out.println(c);
	}
	
}
