package w3resourceArray;

public class FindAspecificeElementAndMakeItNull {

	
	public static void removeELementAndNullit(int arr [] , int index) {
		
		for (int a = index ; a<arr.length-1 ;a++) {
			arr[a] = arr[a+1] ;
			
		}
		for (int q = 0 ;q<arr.length;q++) {
			System.out.print(arr[q]);
		}
		
	}
	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9};
		for (int a = 0 ; a<ar.length ; a++) {
			System.out.print(ar[a]);
		}
		System.out.println();
		removeELementAndNullit(ar , 2);
		
	}

}
