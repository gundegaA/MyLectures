package lv.gundega;

public class TestExceptionHandling {

	
	public static void main(String[] args) {
		
		try{
		int number1 = 10;
		int number2 = 0;
		
		int result = number1/number2;
		int result1 = number2/number1;
		System.out.println(""+result);	
		System.out.println(""+result1);	
			
		} catch (Exception e){
			System.out.println("Checkcode in try block"+e);
		}
		
		try {
		int[]myNumbers = {1,2,3};
		System.out.println(myNumbers[10]);	
		}catch (Exception ee){
			System.out.println("Error");
		}finally{
			System.out.println("The try catch block is finished");
		}
		
		
		
	}

}
