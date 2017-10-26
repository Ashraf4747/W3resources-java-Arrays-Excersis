package w3resourceArray;

import java.util.Random;

public class sumOfTwoMatricx {
	
	
	public static void sumTwoMtricx(int rows, int colums)
	{
		Random ran = new Random ();
		int sum = 0 ;
		int mat1[][] = new int [rows][colums];
		int mat2 [][] = new int [rows][colums];
		for (int i = 0 ; i<rows ; i++) 
		{
			for (int a = 0 ; a<colums ; a++) 
			{
				mat1[i][a] = ran.nextInt(10);
				mat2[i][a] = ran.nextInt(10);
			}
		}
		//show  matricx 1 
		for (int b = 0 ; b<rows ; b++)
		{
			for (int x = 0 ; x<colums ; x++) 
			{
				 int result1 = mat1[b][x];
				 
				 System.out.print(result1 + " | ");
			}
			System.out.println(" ");
		}
		System.out.println("==========================================");
		 // show matricx 2 
		for (int p = 0 ; p<rows ; p++)
		{
			for (int l = 0 ; l<colums ; l++) 
			{
				 int result2 = mat2[p][l];
				 
				 System.out.print(result2 + " | ");
			}
			System.out.println(" ");
		}
		System.out.println("*******************************************");
		
		
		//output sum 2 mat 
		for (int s = 0 ; s<rows ; s++)
		{
			for (int w = 0 ; w<colums ; w++) 
			{
				 int result = mat1[s][w]+mat2[s][w];
				 
				 System.out.print(result + " | ");
			}
			System.out.println(" ");
		}
		//sum two matricx
	
		
	}
	//main 
	public static void main (String [] args) 
	{
		// rows and colums for 2 matricx
		sumTwoMtricx(10, 10);
		
	}

}
