package lv.gundega.figure;

public class Rectangle {

	private float length;
	private float width;
	
	//2 konstruktori
	public Rectangle(){
		this.length = 0;
		this.width = 0;
	}

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	//geter and setter
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	
	
}
