import java.util.Arrays;


public class ArraysPrimitiveDataType {

	
	public static void main(String[] args) {
		
		int[] arrays;
		//int arrays2[];
		arrays = new int[2];
		
		//VAI
		
		int[] arr =new int[11];
		
		int[] arrTest = new int[9];
		
		arrTest[0] = 10;
		arrTest[1] = 8;
		
		System.out.println(arrTest[0]+" "+arrTest[1]);
		System.out.println(Arrays.toString(arrTest));
	
//nakamais
		System.out.println("+++++++++++++++++++++++++++++++++++");
		double [] doubleArray = new double[3];
		doubleArray [0]=0.3;
		doubleArray [1]=3.6;
		doubleArray [2]=9.67;
		System.out.println(doubleArray [0]+" "+doubleArray [1]+" "+doubleArray [2]);
		System.out.println(Arrays.toString(doubleArray));
		
		
//hdhdhdhdhdhh
		
		boolean[] booleanArray =new boolean[2];
		booleanArray[0] = true;
		booleanArray [1] = false;
		System.out.println(Arrays.toString(booleanArray));
		
		int checkLenght = arrTest.length;
		System.out.println(checkLenght);
	}

}
