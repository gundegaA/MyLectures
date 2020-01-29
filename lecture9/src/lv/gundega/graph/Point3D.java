package lv.gundega.graph;

//To inheritance class we use EXTENDS keyword
//super parmanto mainigo (ja ieliek pie mainiga) un konstruktoru (ja ieliek taja)
public class Point3D extends Point2D{

	private int z;
	
	public Point3D(){
		super();
		this.z=0;
	}
	
	public Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
//gettersetter
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//tostring
		public String toString() {
			return "(" + super.getX() + ";" + super.getY()+ ";"+this.z+")";
		}
	
	
}
