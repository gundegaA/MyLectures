package lv.gundega.geometricfigures;

public class Circle {
	
	//final- nevar mainit
	public static final double DEFAULT_RADIUSS = 8.8;
	public static final String DEFAULT_COLOR = "red";
	
	
	private double radiuss;
	private String color;
	
	public Circle(){
		this.radiuss = DEFAULT_RADIUSS;
		this.color = DEFAULT_COLOR;
	}
	
	public Circle(double r){
		this.radiuss = r;
		this.color = DEFAULT_COLOR;
	}
	
	public Circle(double r, String c){
		this.radiuss = r;
		this.color = c;
	}
	
	
	public double getRadiuss() {
		return radiuss;
	}
	public void setRadiuss(double radiuss) {
		this.radiuss = radiuss;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//*************************************************************
	public double area(){
		
	return this.radiuss * this.radiuss * Math.PI;
	}
	
	public String toString(){
	return "Radiuss: "+ this.radiuss+" color: "+ this.color;	
	}
		
			
	
	

}
