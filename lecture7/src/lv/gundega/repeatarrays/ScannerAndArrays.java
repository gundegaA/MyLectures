package lv.gundega.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
//		System.out.println("Input first array value!");
//		arr[0] = sc.nextInt();
//		System.out.println("Input second array value!");
//		arr[1] = sc.nextInt();
//		
//		
//		System.out.println(arr[0]+"   "+arr[1]);
		System.out.println("Ievadi garumu!");
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i=0; i<l-1; i++){
			System.out.println("ievadi "+(i+1)+". masiva vertibu!");
			arr[i] =sc.nextInt();
		}
		System.out.println(""+arr);

	}

}
