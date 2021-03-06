package lv.gundega.interfaces;

public class rectangle implements Shape {

	private int length;
	private int width;

	// KONSTRUKTORS
	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "rectangle [length=" + length + ", width=" + width + "+++++]";
	}

	@Override
	public double getArea() {
		return length * width;
	}

}
