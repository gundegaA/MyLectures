public class Calculator {

	public static void main(String[] args) {

		// KALKULATORS

		double num1 = 3;
		double num2 = 7;
		char c = '+';

		if (c == '+') {
			System.out.println("" + num1 + c + num2 + " = " + (num1 + num2));
		} else if (c == '-') {
			System.out.println("" + num1 + c + num2 + " = " + (num1 - num2));
		} else if (c == '*') {
			System.out.println("" + num1 + c + num2 + " = " + (num1 * num2));
		} else if (c == '/') {
			System.out.println("" + num1 + c + num2 + " = " + (num1 / num2));
		} else if (c == '%') {
			System.out.println("" + num1 + c + num2 + " = " + (num1 % num2));
		} else
			System.out.println("No such operator!");

		System.out.println("-------------------------------");

		switch (c) {
		case '+':
			System.out.println("" + num1 + c + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println("" + num1 + c + num2 + " = " + (num1 - num2));
			break;
		case '/':
			System.out.println("" + num1 + c + num2 + " = " + (num1 / num2));
			break;
		case '*':
			System.out.println("" + num1 + c + num2 + " = " + (num1 * num2));
			break;
		case '%':
			if (num1>=num2){
			System.out.println("" + num1 + c + num2 + " = " + (num1 % num2));
			}else System.out.println("First number was smaller,but it works too :) " + num1 + c + num2 + " = " + (num1 % num2));
			break;
		default:
			System.out.println("No such operator!");
		}
	}

}
