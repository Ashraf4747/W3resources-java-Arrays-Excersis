package w3resourceArray;

public class checkForSpecificeInt {

	
	public static boolean check (int arr[] , int spec1 , int spec2) {
		int s1 = 0 ;
		int s2 = 0 ;
		boolean check = false;
		for (int i = 0 ; i<arr.length ; i++) {
			if (arr[i] == spec1) {
				s1 = arr[i];
			}
			else if (arr[i] == spec2) {
				s2 = arr[i];
			}
			
		}
		if (s1==spec1&& s2==spec2) {
		check = true;
		}		
		return check;
	}
	
	
	public static void main (String [] args) {
		int ar [] = {1,2,3,4,5,6,7,8,90};
		boolean c = check (ar , 2 , 9);
		System.out.println(c);
		
	}
}
