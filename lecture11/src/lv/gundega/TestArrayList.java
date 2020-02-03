package lv.gundega;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		

		ArrayList<String> cars = new ArrayList<>();
		cars.add("AUDI");
		cars.add("BMW");
		cars.add("FORD");
		cars.add("MAZDA");
		cars.add("WV");
		cars.add("HONDA");
		cars.add("HUNDAI");
		cars.add("TOYOTA");
		cars.add("VOLVO");
		cars.add("KIA");
		
		System.out.println(cars);
		System.out.println(cars.size()); //lielums
		System.out.println(cars.set(0, "OPEL"));
		System.out.println(cars);
		
		//for each
		for (String car : cars){
			System.out.println(car);
		}
		System.out.println("********");
		cars.remove("FORD");
		cars.remove("bmw".toUpperCase());
		
		System.out.println(cars.size());
		System.out.println("First is: "+cars.get(0));
		cars.remove(cars.get(0));
		System.out.println("First is: "+cars.get(0));

	}

}
