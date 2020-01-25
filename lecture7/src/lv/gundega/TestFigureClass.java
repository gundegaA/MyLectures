package lv.gundega;

import java.awt.geom.Area;

import lv.gundega.geometricfigures.Circle;

public class TestFigureClass {

	public static void main(String[] args) {
		Circle figure = new Circle();
		Circle figure1 = new Circle(40.2);
		Circle figure2 = new Circle(7.4, "blue");
		
		

		System.out.println(figure.getColor() + "   " + figure.getRadiuss());
		System.out.println(figure1.getColor() + "   " + figure1.getRadiuss());
		System.out.println(figure2.getColor() + "   " + figure2.getRadiuss());
		System.out.println(figure.toString()+" and the are is: "+figure.area());

	}

}
