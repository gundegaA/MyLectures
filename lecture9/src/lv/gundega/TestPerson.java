package lv.gundega;

import java.util.Arrays;

import lv.gundega.users.Teacher;

public class TestPerson {

	
	public static void main(String[] args) {
		
		String[] strArr = new String[8];
		strArr[0]= "Sport";
		strArr[1]= "Math";
		strArr[2]= "Chemistry";
		strArr[3]= "History";
		
		System.out.println(Arrays.toString(strArr));
		
		Teacher teacher1 = new Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());
		teacher1.addCourse("Biology");
		teacher1.addCourse("Math");
		
		String[] courses = {"Sport", "Math", "Biology", "History"};
		for(String course : courses){
			teacher1.addCourse(course);
			
		}
		

	}

}
