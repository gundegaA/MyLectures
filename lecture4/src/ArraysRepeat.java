import java.util.Arrays;

public class ArraysRepeat {

	public static void main(String[] args) {

		double[] varArrays = new double[3];

		varArrays[0] = 0.5;
		varArrays[1] = 1.0;
		varArrays[2] = 1.5;

		double[] masivs = new double[10];
		
		for (int i=0;i<10; i++){
			masivs[i] = i*i;
		}
		System.out.println(Arrays.toString(varArrays));
		System.out.println(Arrays.toString(masivs));
	}

}
