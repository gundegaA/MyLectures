
public class OperatorsMath {

	public static void main(String[] args) {
		double num1 = 14.2d;
		double num2 = 0.3d;
		double result1 = num1+num2;
		double result2 = num1-num2;
		double result3 = num1/num2;
		double result4 = num1%num2;
		char operators1 = '+';
		char operators2 = '-';
		char operators3 = '/';
		char operators4 = '%';
		System.out.println(""+num1 + " "+operators1+" " +num2 + " = "+ result1);
		System.out.println();
		System.out.println(""+num1 + " "+operators2+" " +num2 + " = "+ result2);
		System.out.println();
		System.out.println(""+num1 + " "+operators3+" " +num2 + " = "+ result3);
		System.out.println();
		System.out.println(""+num1 + " "+operators4+" " +num2 + " = "+ result4);

		int a=10;
		int b=3;
		int x = a % b;
		System.out.println(x);
		
		int i=3;
		i++;
		System.out.println(i);
	}

}
