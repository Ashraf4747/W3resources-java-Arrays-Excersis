package w3resourceArray;

public class checkForSpecificValue {
	static public void checkArray (int arr[], int val) {
		for (int i = 0 ; i<arr.length - 1 ;i++) {
			if (arr[i] == val) {
				System.out.println(val + " in index " + arr[i] );
			}
			
		}
			
	}
	public static void main(String[] args) {
		int data [] = {1,54,785,248,2569,8528};
		checkArray (data , 504);
		// TODO Auto-generated method stub

	}

}
