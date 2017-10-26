package w3resourceArray;

public class dublicated {
	
	
	
	public static void duplicate (int arr []) {
		int dub = arr[0];
		int NumberOfDuplicated = 0 ;
		
		for (int i = 1  ; i<arr.length ;i++) {
			if (arr[i] == dub) {
				NumberOfDuplicated++;
				System.out.println(arr[i] + " is duplicated");
			}
			
		
		
		}
		System.out.println("Number of duplicated item in the given array is : " + NumberOfDuplicated);
	}
	
	
	public static void main (String [] args) {
		int array [] = {3,4,5,6,3,4};
		duplicate(array);
	}

}
