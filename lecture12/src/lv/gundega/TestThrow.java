package lv.gundega;

public class TestThrow {

	
	public static void main(String[] args) {
		
checkAge(4);
	}
	
	public static void checkAge(int age){
		if(age<18){
			throw new ArithmeticException("Access denied");
		}else{
			System.out.println("Access granted");
		}
	}

}
