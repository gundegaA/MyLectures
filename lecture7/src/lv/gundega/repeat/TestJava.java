package lv.gundega.repeat;

import java.util.Scanner;

public class TestJava {

	private static Scanner input;

	public static void main(String[] args) {

				input = new Scanner(System.in);
		System.out.println("Input value ");
				//int inputvalue = input.nextInt();
		
				//GRIBAM, LAI IEVADA TIKAI INTEGER
		int inputvalue;
		while (input.hasNext()){
		if(input.hasNextInt()){
			inputvalue = input.nextInt();
			System.out.println("Assigne to variable with type int: "+inputvalue);
		}else{
			
	    System.out.println("That is not a number. Try again.");
	    input.next();
		}
		}
	
		
	}
}
