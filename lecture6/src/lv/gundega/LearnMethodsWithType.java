package lv.gundega;

public class LearnMethodsWithType {

	public static void main(String[] args) {
		double area = getArea();
		System.out.println("Area of rectangle is "+area);
	}

	public static double getArea() {
		double num1 = 20.3;
		double num2 = 10.0;
		double result = num1 *num2;
		return result;
	}
}
