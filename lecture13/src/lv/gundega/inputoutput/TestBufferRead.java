package lv.gundega.inputoutput;

import java.io.*;

public class TestBufferRead {

	//throws exceptoin (tas kas  try catch)
	public static void main(String[] args) throws Exception {
		
		File file = new File("Data.txt");
		FileReader filReader = new FileReader(file);
		
		BufferedReader buffReader = new BufferedReader(filReader);
		
		String stringFileData;
		
		while ((stringFileData = buffReader.readLine())!=null){
			System.out.println(stringFileData);
		}

	}

}
