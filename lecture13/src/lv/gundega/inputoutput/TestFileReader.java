package lv.gundega.inputoutput;
import java.io.*;
public class TestFileReader {

	
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("Data.txt");
		int i;
		char test =101;
		System.out.println(test);
		while((i=fr.read()) !=-1){
			System.out.print((char) i);
		}
	}

}
