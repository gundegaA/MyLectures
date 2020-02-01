package lv.gundega;

import lv.gundega.polymorphism.Animal;
import lv.gundega.polymorphism.Cat;
import lv.gundega.polymorphism.Dog;

public class TestPolymorphism {

	public static void main(String[] args) {

			//POLYMORPHISM
		Animal myAnimal = new Animal(); // Create a Animal object
		Animal myDog = new Dog(); // Create a Pig object
		Animal myCat = new Cat(); // Create a Dog object
		
		//IZSAUCAM METODES KATRAM INSTANCES MAINIGAJAM
		myAnimal.animalSound();
		myCat.animalSound();
		myDog.animalSound();
	}

}
