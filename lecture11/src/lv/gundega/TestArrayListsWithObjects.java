package lv.gundega;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayListsWithObjects {

	
	public static void main(String[] args) {
		
		//wrapper
		//sis ir klases
		Integer intObj = 40;
		Double doubleObj = 40.24;
		System.out.println(intObj);

		ArrayList<Integer> intArrays = new ArrayList<>();
		intArrays.add(50);
		intArrays.add(23);
		intArrays.add(24);
		System.out.println(intArrays);
		
		Collections.sort(intArrays);
		System.out.println(intArrays);
	}

}
