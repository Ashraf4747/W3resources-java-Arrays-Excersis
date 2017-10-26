package w3resourceArray;

public class findMaxAndMin {
	
	//Start max number in array 
	static public  void max (int arr []) {
		//initial max value it can initial to arr[0] too
		int max =  arr[0] ;
		//cashing arr.length to do not calculate the length every iteration in for loop
		int len = arr.length ;
		// looping through the array to the end 
		for (int i = 1 ; i<len ; i++)
		{
			// compareing if the first number is bigger than the next or not
			//if (arr[i] > arr[i+1])
			//{
				// if true , bigger than
				// compare it with the max and the bigger stored in max 
				if (arr[i] > max)
				{
					//
					max = arr[i];
				}
			}
		//}
		//this step because i love doing loop from 0 to end so i cant do i++ to the end 
		// it will case null point exception so i let the last item and compare it after the loop 
		
		//compare the bigger item (form 0 to the item before the last item) with the last item
		//
		//if (arr[arr.length-1] > max) {
			// if the last item bigger than the item storded in max so make max equal to arr[arr.length-1]
			
			// max = arr[arr.length];
		//}
		//if not exist 
		
		// output max 
		System.out.println(max);
	}
	//end of max method
	
	
	//start min method
	public static void min (int arr[]) {
		 //initial the first item to min 
		int min = arr[0] ; 
		//loop inside the array and compareing
		for(int a = 0 ; a<arr.length-1 ; a++) {
			//if (the first item is smaller than the after item so 
			//if(arr[a]<arr[a+1]) {
				// compare the smallest with the min item 
				if (arr[a]<min) {
					//if true make the min equal to the smaller 
					min = arr[a];
				}
			}
		//}
		
		//the last item compared with the smallest item from (from 0 index to index arr.length- 2 ) 
		if (arr[arr.length-1] < min) {
			//if true make min equal to the smallest one 
			min = arr[arr.length];
		}
		
		// output the result 
		System.out.println(min);
		
	}
	
	
	public static void main (String [] args) {
		// make array of integers
		int ar [] = {0,1500,7,41,268000,1000000};
		
		//call max method
		max(ar);
		//call min method 
		min(ar);
	
	// min and max method build in java
		//max 
		
	
	
	}

}
