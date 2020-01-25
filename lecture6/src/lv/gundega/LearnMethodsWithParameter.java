package lv.gundega;

public class LearnMethodsWithParameter {

	
	public static void main(String[] args) {
		
		double radiuss = 30.9;
		String color = "red";
		
		int resultWithCastInt = getArea(radiuss);
		System.out.println("Area of circle is "+resultWithCastInt);
		
		double result = getAreaForCircle(radiuss);
		System.out.println("Area of circle is "+result);

		System.out.println(getColorAndArea(color, result));
	}

	public static int getArea(double radiuss){
		double result = Math.PI*Math.pow(radiuss, 2);
		return (int) result;
	}
	
	public static double getAreaForCircle(double radiuss){
		double result = Math.PI*radiuss*radiuss;
		return result;
	}
	
	public static String getColorAndArea(String color, double area){
		return "Color: "+ color+" and area: "+area;
	}
}
