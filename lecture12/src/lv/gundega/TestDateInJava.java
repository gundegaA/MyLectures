package lv.gundega;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {

	
	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println(myDateObj);
		
		DateTimeFormatter myFormatObjTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDate = myDateObj.format (myFormatObjTime);
		System.out.println(formatedDate);

	}

}
