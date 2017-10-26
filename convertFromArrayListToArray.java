package w3resourceArray;

import java.util.ArrayList;

public class convertFromArrayListToArray {
	
	
	
	public static void main (String [] args) {
		ArrayList <String> l = new ArrayList<String> ();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		l.add("6");
		String arr [] = new String [l.size()];
		l.toArray(arr);
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
