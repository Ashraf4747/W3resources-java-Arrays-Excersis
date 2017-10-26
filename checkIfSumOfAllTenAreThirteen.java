package w3resourceArray;

public class checkIfSumOfAllTenAreThirteen {

	
	
	public static boolean sumitionOfTens (int arr[]) {
		int sum = 0 ;
		int len = arr.length ;
		boolean check = true ;
		for (int i = 0 ; i<len ; i++) {
			if (arr[i] == 10) {
				sum+=10;
			}
		}
		if (sum == 30) {
			return check ;
		}
		else {
			check = false;
		}
		return check ;
		
	}
	
	public static void main (String []args) {
		int ar [] = {10,20,3,10,4,8,1,10};
		boolean c = sumitionOfTens(ar);
		System.out.println(c);
	}
	
	
}
