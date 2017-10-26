package w3resourceArray;


public class FindeIndexOfElement {

	
	static public int indexOf (int arr[] , int val) {
		int index  = 0 ;
		if (arr.length > 0 ) {
		for (int i = 0 ; i<arr.length-1 ; i++) {
			if (arr[i] == val) {
				index = i ;
			}
		}
		}
		
		else {
			return -1;
		}

		return index;
		
	}
	public static void main(String[] args) {

		int arr [] = {1,5,7,89,45};
		
		
		int in = indexOf(arr , 7);
		System.out.println(in);
	
	}

}
