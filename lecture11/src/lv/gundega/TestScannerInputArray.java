package lv.gundega;

import java.util.Arrays;
import java.util.Scanner;

public class TestScannerInputArray {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Ievadi garumu!");
		int l = sc.nextInt();
		
		String[] strArr = new String[l];
		for (int i=0; i<l; i++){
			System.out.println("Ievadi "+(i+1)+". masiva vertibu!");
			strArr[i] =sc.next();
		}
		//System.out.println(""+Arrays.toString(strArr));
		System.out.println("Do you want to print this array?");
	}

}
