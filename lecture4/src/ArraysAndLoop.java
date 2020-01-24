
public class ArraysAndLoop {

	
	public static void main(String[] args) {
	
		int[] marks= {45,76,87,34,66,87,100};
		
		//make to string and print in console
		
		for (int i=0;  i < marks.length; i++ ){
			System.out.println(marks[i]);
		}
		System.out.print("[");
		for (int i=0;  i < marks.length-1; i++ ){
			System.out.print(marks[i]+", ");
		}
		System.out.print(marks[marks.length-1]+"]");
	}

}
