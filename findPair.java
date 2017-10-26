package w3resourceArray;

public class findPair {
	
	
	public static void pairs(int arr[] , int num) {
		int len = arr.length;
		for (int i = 0 ; i <len ; i++)
		{
			for (int a = 1 ; a<len ;a++) 
			{
				if (arr[i]+arr[a] == num) 
				{
					System.out.println(arr[i] +" + " + arr[a] + " = " + num);
				}
			}
		}
	}
	
	public static void main (String [] args) 
	{
		int ar [] = {2,5,7,8,3};
 		pairs(ar , 10);
	}

}
