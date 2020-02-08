package lv.gundega.inputoutput;

import java.io.*;

public class TestCreateAndWriteFile {

	
	public static void main(String[] args) throws Exception {
	
		File fileObj = new File("Data2.txt");
		FileWriter fw = new FileWriter (fileObj,true);
		BufferedWriter bw = new BufferedWriter((fw));
		//bw.newLine();
		bw.write(" \n Jauns teksts");
		bw.write(" \n Jauns teksts numur2");
		bw.close();
		
		
		//RAKSTA ARI BEZ SI UN IZVEIDO JAUNO FAILU!!!!!!
		
//		if(fileObj.createNewFile()){
//			System.out.println("File created: "+ fileObj.getName());
//		}else{
//			System.out.println("File already exists");
//		}
		//
		//fw.write("How are you doing? +++++");
		//fw.append("\n Im good!");
		//fw.close();
		

		
	}
//	String textToAppend = "Happy Learning !!";
//    
//    BufferedWriter writer = new BufferedWriter(
//                                  //Set true for append mode
//                            );  
//       //Add new line
//    
//   
	

}
