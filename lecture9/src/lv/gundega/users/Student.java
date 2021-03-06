package lv.gundega.users;

public class Student extends Person {
	
	private int numCourse;
	private String [] courses;
	private int[] grades;
	private static final int MAX_COURSES = 8;
	
	public Student(String name,String address ){
	super(name,address)	;
	this.numCourse= 0;
	this.courses = new String[MAX_COURSES];
	this.grades = new int[MAX_COURSES];
	}
	
	public void addCourseGrade(String kurss, int atzime){
		courses[numCourse] = kurss;
		grades[numCourse] = atzime;
		++numCourse; //izsaucot metodi, palielinas kursa numuru par 1
	}
	
	public void printGrades(){
		System.out.println();
		for (int i=0; i<numCourse;i++){
			System.out.println(""+courses[i]+": "+grades[i]);
			System.out.println();
		}
	}
	
	
	
	public double getAverageGrade(){
		int sum = 0;
		for (int i=0; i<numCourse;i++){
			sum = sum + grades[i];
		}
		return (double)sum/numCourse;
	}
	
	public String toString(){
		return "Student: "+super.toString();
	}
	//vel vajadzes videjo
	
	

}
