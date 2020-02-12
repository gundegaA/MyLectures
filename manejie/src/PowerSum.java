import java.lang.Math;
import java.math.BigInteger;
public class PowerSum {
	
	
	public static void main(String[] args) {
		
		int x=2;
		int power = 63;
		System.out.println((long)Math.pow(2,62));
		System.out.println((long)Math.pow(2,63));
		System.out.println((long)Math.pow(2,64));
		System.out.println((long)Math.pow(2,65));
		BigInteger result;
		result =   Math.pow(x, power);
		System.out.println("result is "+ result);
		
		int length = String.valueOf(result).length();
		long maxDiv = (long) Math.pow(10, length-1);
		System.out.println(maxDiv);
		
		long sum = 0;
		long diff = result;
		int num =0;
		for (int i=0; i<30;i++){
			System.out.println(i);
			System.out.println((int)Math.pow(2,i));
		}
	}

}
