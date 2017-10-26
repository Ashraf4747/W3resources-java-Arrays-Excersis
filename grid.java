package w3resourceArray;

public class grid {
	
	
	
	static public void grid (String sign ) {
		for (int i = 0 ; i<10 ; i++) {
			for (int a = 0 ; a < 10 ; a++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}
	// another shape
	static public void newGrid(String sign) {
		for (int i = 0 ; i<10 ;i++) {
			for (int a = 0 ; a < i+1 ;a++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		grid("*");
		newGrid("*");
		
	}

}
