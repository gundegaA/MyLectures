package lv.gundega;

import lv.gundega.repeatJavaClassOOP.ClassExtendsAbstractClass;
import lv.gundega.repeatJavaClassOOP.Encapsulation;
import lv.gundega.repeatJavaClassOOP.MyClass;
import lv.gundega.repeatJavaClassOOP.MyClassMethods;
import lv.gundega.repeatJavaClassOOP.MyEnums;

public class TestOOP {

	
	public static void main(String[] args) {
		
		MyClass newObj = new MyClass();
		
		newObj.getClass();
		newObj.x=2;
		
		MyClass newObj2 =new MyClass();
		
		System.out.println(newObj.equals(newObj2));
		
		MyClassMethods myObjMethod = new MyClassMethods();
		myObjMethod.myMethod();
		myObjMethod.myStringMethod();
		System.out.println(myObjMethod.myStringMethod());
		
		Encapsulation objEncps = new Encapsulation();
		System.out.println("user "+objEncps.getUser());
		objEncps.setUser("Guu");
		System.out.println("user "+objEncps.getUser());
		
		//ENUM
		MyEnums status=MyEnums.HIGH;
		System.out.println("This object is "+status);
		
		switch(status){
		case LOW:
			System.out.println("Low status");
			break;
		case MEDIUM:
			System.out.println("Medium status");
			break;
		case HIGH:
			System.out.println("High status");
			break;
		default:
			System.out.println("No status");
		}
		
		String numberStr = "240";
		int numberInt = Integer.parseInt(numberStr);
		System.out.println(numberInt+1);
		
		Integer valueInt =Integer.valueOf(numberStr);
		System.out.println(numberInt+1);
		
		ClassExtendsAbstractClass objAbstrClass = new ClassExtendsAbstractClass();
		objAbstrClass.sleep();
		objAbstrClass.abstractMethod();
	}
	
	

}
