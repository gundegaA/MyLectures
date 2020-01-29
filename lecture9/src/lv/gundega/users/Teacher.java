package lv.gundega.users;

import java.util.Arrays;

public class Teacher extends Person{
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 4;
	
	public Teacher(String name,String address){
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
		
	}
	
	public void addCourse (String course){
		courses[numCourses] = course;
		System.out.println(Arrays.toString(this.courses));
		++numCourses;
	}
	
	public boolean addCourses (String course){
		return true;
	}
	
	public String toString(){
		return "Teacher: "+super.toString();
	}
	
	

}
