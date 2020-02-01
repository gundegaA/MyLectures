package lv.gundega;

import java.lang.reflect.Array;
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
		
		String[] courses = {"Sport", "Math", "Biology", "History"};
	
		//for(String course : courses){
			//teacher1.addCourse(course);
			
		//}
		
		Teacher t1 = new Teacher ("Toms B", "Rigas iela");
		System.out.println(t1.toString());
		
		String[] coursesForT1 = {"wiiii","aaaaa", "oooooooo", "wiiii"};
		
		for(String c:coursesForT1 ){
			if(t1.addCourses(c)){
				System.out.println(c+" added");
				
			}else{
				System.out.println("This "+c+" can't be added");
			}
			
		}
		System.out.println(Arrays.toString(coursesForT1));
		for(String c:coursesForT1 ){
			if(t1.removeCourses(c)){
				System.out.println(c+" removed");
				
			}else{
				System.out.println("This "+c+" can't be removed");
			}
			
		}
		System.out.println(Arrays.toString(coursesForT1));

	}

}
