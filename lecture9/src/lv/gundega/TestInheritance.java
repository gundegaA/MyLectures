package lv.gundega;

import lv.gundega.graph.Point2D;
import lv.gundega.graph.Point3D;
import lv.gundega.graph.Point4D;

public class TestInheritance {

	
	public static void main(String[] args) {
		
		//veidojam objektu Point2D instanci
		Point2D point =new Point2D();
		//pats defaultakais rasejums
		System.out.println(point.toString());
		
		//tagad izmantosim otru konstruktoru
		Point2D pointxy = new Point2D(10,-2);
		System.out.println(pointxy.toString());
		
		//abi darbojas ari bez toString!!!!!!!!!!!!!!!!!
		
		pointxy.setX(3);
		pointxy.setY(-89);
		System.out.println(pointxy);
		
		System.out.println("x: "+pointxy.getX());
		
		Point3D pointxyz =new Point3D(7,9,8);
		System.out.println(pointxyz);
		
		Point4D pointxyzt =new Point4D(7,9,8,6);
		System.out.println(pointxyzt);
		
		
	}

}