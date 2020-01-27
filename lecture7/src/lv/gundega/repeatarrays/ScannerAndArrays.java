package lv.gundega.repeatarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ievadi garumu!");
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i=0; i<l; i++){
			System.out.println("ievadi "+(i+1)+". masiva vertibu!");
			arr[i] =sc.nextInt();
		}
		System.out.println(""+Arrays.toString(arr));

	}

}
