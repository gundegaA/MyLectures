package lv.gundega.learstring;

public class testStringClass {

	
	public static void main(String[] args) {

//		String str="Index";
//		String strClass =new String(str);
//		
//		System.out.println(str);
//		System.out.println("String like object "+strClass);
//		
//		int stringLength =str.length();
//		System.out.println(stringLength);
//		
//		System.out.println(str.charAt(2));
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(!s1.equals(s2));
	}

}
