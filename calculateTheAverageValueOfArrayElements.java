package w3resourceArray;

import java.util.Scanner;

public class calculateTheAverageValueOfArrayElements {
	
	static Scanner scn = new Scanner (System.in);
	
	static public float Average (int arr []) {
		int sum = 0 ;
		float average = 0 ;
		int len = arr.length;
		for (int i = 0 ; i<len ; i++) {
			sum+=arr[i];
		}
		average = sum / len ;
		
		return average;
	}

	public static void main(String[] args) {
		System.out.println("Array length");
		int length = scn.nextInt();
		int arr [] = new int [length];
		for (int i = 0 ; i<length ; i++) {
			arr[i] = scn.nextInt();
		}
		float av = Average(arr);
		System.out.println(av);
	}

}
