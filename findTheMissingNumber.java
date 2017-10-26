package w3resourceArray;

public class findTheMissingNumber {
	
	public static void missing(int arr[]) {
		for (int i = 0 ; i<arr.length-1 ;i++)
		{
			if (arr[i+1] != arr[i]+1) 
			{
				while (arr[i] != arr[i+1]-1) {
					arr[i] = arr[i]+1 ;
					System.out.println(arr[i]);
				}
				
			}
			
		}
	}
	public static void main(String [] args) {
		//case 1
		//int ar[] = {10,20,30,40,50,60}; from 11 to 19 , from 21 to 29 and so on 
		//case 2
		//int ar[] = {1,2,3,4,6}; // 5
		//case 3 
		//int ar[] = {11,12,14,15,18}; output 13/16/17 are missiing
		//System.out.println(ar[0]+1);
		//missing(ar);
		int f = (10+2)*(10-5)/10-3*(10*5);
		System.out.println(f);
	}

}
