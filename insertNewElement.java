package w3resourceArray;

public class insertNewElement {

	
	public static void insert (int arr [] , int ele , int index) {
		int ar [] = new int [arr.length + 1] ;
		
		for (int i = 0 ; i<=index ;i++ ) {

		if (i == index) {
			ar[index] = ele;
		}
		
		else {
		ar[i] = arr[i];
		}
		
		}
		
		for (int  q = index +1 ; q<ar.length ;q++) {
			ar[q] = arr[q-1];
		}
		for (int a = 0  ; a<ar.length ; a++) {
			System.out.print(ar[a]);
		}
		
	}
	public static void main (String []args) {
		int data [] = {1,2 ,3,5,6,7};
		insert (data ,4 ,3);
	}
}
