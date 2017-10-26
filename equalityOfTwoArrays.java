package w3resourceArray;

public class equalityOfTwoArrays {
	
	
	public static void equality(int arr1[] , int arr2[]) {
		boolean areEqual = true;
		if (arr1.length == arr2.length) 
		{
			for (int i = 0 ; i<arr1.length ;i++) 
			{
				if (arr1[i] == arr2[i]) 
				{
					areEqual = true ;
				}
				else {
					areEqual = false ;
				}
			}
			
		}	
		
		if (areEqual) {
			System.out.println("Are Equal");
		}
		else {
			System.out.println("Not Equal");
			
		}
	}
	public static void main (String[] args) {
		int ar1 [] = {1,2,3,4,5,6,7,8,9};
		int ar2 [] = {1,2,3,4,5,6,7,8,59};
		int ar3 [] = {1,2,3,4,5,6,7,8,9};
		
		equality(ar1 , ar2);
		equality(ar1 , ar3);
	}

}
