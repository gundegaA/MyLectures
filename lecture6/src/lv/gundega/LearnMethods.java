package lv.gundega;

public class LearnMethods {

	// KEYWORDS
	// void - has not return type
	// static - doesn't have to make object????
	// public/private/protected

	public static void main(String[] args) {
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		System.out.println("______________________________");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.doYouHaveCat();
		
		
		
	}

	public static void getMyName() {
		System.out.println("My name is Gundega");
	}

	public static void getMyCity() {
		getMyName();
		System.out.println("My city is Riga");
	}

	public void doYouHaveCat() {
		System.out.println("YES");
	}
}
