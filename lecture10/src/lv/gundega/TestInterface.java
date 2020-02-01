package lv.gundega;

import lv.gundega.interfaces.Shape;
import lv.gundega.interfaces.Triangle;
import lv.gundega.interfaces.rectangle;

public class TestInterface {

	
	public static void main(String[] args) {
		
		
		int num1 =20;
		int num2 = 34;
		
		Shape figure1 =new rectangle (num1, num2);
		System.out.println(figure1.toString());
		System.out.println(figure1.getArea());
		
		Shape figure2 =new Triangle (num1, num2);
		System.out.println(figure2.toString());
		System.out.println(figure2.getArea());
		
		

	}

}
