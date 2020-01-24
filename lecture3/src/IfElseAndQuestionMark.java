
public class IfElseAndQuestionMark {

	//Ternary operator???????????????
	
	public static void main(String[] args) {
		
	//1.piemers
		boolean test  = false;
		
		if(test){
			System.out.println("Test pass true");
		}else{
			System.out.println("Test pass false");
		}
		
	//2.piemers
		/**
		 String stringExp = "Te ir string vertiba";
		 String res = (test)? "Test pass true" : "Test pass false";
		 System.out.println(res);
		 System.out.println(stringExp);
		 */
		
	//3.piemers
		
		int num1 = 5;
		int num2 = 10;
		int result;
		
		result = (num1 > num2) ? (num1 + num2) : (num1 - num2);
		System.out.println(result);
	}

}
