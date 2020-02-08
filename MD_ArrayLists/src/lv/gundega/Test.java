package lv.gundega;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));

		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 7, 8, 11, 17, 19, 20, 23, 28, 37, 59, 81));

		System.out.println("List1 is: " + list1);
		System.out.println("List2 ir: " + list2);
		System.out.println("Elements in both lists: ");
		Intersect(list1, list2);
	}
	// beidzas main

	// sakam atlasit kopigos
	public static ArrayList<Integer> Intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					list3.add(list1.get(i));
					break;
				}
			}
		}
		System.out.println(list3);
		return (list3);
	}

}
