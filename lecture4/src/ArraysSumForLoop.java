public class ArraysSumForLoop {

	public static void main(String[] args) {

		int[] marks = { 5, 2, 5, 2, 5, 2, 7 };

		// sum all values in array
		int sum = 0;
		int sum1 = 0;
		int multi = 1;
		int minus = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
			sum1 += marks[i];
			multi *= marks[i];
			minus -= marks[i];

		}
		System.out.println("Sum is " + sum + " or " + sum1);
		System.out.println("Multiplication is " + multi);
		System.out.println("Starpiba is " + minus);

	}

}
