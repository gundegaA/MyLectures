package lv.gundega.repeat;

import java.util.Scanner;

public class TestJava {

	public static void main(String[] args) {

				//SCANNER
		Scanner input = new Scanner(System.in);
		System.out.println("Input value ");
				//int inputvalue = input.nextInt();
		
				//GRIBAM, LAI IEVADA TIKAI INTEGER
		int inputvalue;
		while (input.hasNextInt()){
			try{
			inputvalue = input.nextInt();
			System.out.println("Assigne to variable with type int: "+inputvalue);
			}catch (Exception e) {
	    System.out.println("That is not a number. Try again.");
		}
		
		

//		Scanner keyboard = new Scanner (System.in);
//		 System.out.println("How many pigs are there?");
//		 if(keyboard.hasNextInt()) {
//
//		   int number =  keyboard.nextInt();        
//
//		   }else{ 
//		        System.out.println("Not an integer number!");
//		        keyboard.next();
//		   }
		
		
//		int number = 0; // you need to initialize your variable first
//		while (true) {
//		    try {
//		    number = Integer.parseInt(keyboard.nextLine());
//		    break; // this will escape the while loop
//		    } catch (Exception e) {
//		    System.out.println("That is not a number. Try again.");
//		    }
//		}
	
		}
	}
}
