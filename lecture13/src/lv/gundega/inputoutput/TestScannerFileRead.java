package lv.gundega.inputoutput;

import java.io.*;
import java.util.Scanner;

public class TestScannerFileRead {

	
	public static void main(String[] args) throws Exception{
		
		File file = new File("Data.txt");
		
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		

	}

}
