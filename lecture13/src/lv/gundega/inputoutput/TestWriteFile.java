package lv.gundega.inputoutput;

import java.io.*;

public class TestWriteFile {

	
	public static void main(String[] args) throws Exception{
		File file = new File("Data1.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		String stringToFile = "Hello, Gundega! :)";
		String stringToFile1 = "Hello to you too! :)";
		bw.write(stringToFile);
		bw.write('\n');
		bw.write(stringToFile1);
		bw.close();
		

	}

}
