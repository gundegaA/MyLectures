package lv.gundega;

import lv.gundega.figure.Rectangle;

public class TestFigure {

	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		Rectangle rectangle2 = new Rectangle (2.0f,3.0f);
		System.out.println(rectangle2.toString());

	}

}
