package lv.gundega;

import lv.gundega.bookstore.Author;
import lv.gundega.bookstore.Book;

public class TestBookStore {

	
	public static void main(String[] args) {
		
		Author rowling=new Author ("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis=new Author ("Rainis", "rainis@gmail.com", 'm');
		
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowli@gmail.com");
		System.out.println(rowling.getEmail());
		
		
		
		Book harrypotter=new Book("Harry Potter", rowling, 20.3, 1000); 
		System.out.println(harrypotter.toString());
		
		
		
		System.out.println("********************************************");
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		

		//instances mainigie
		Author test1 = new Author ("name","name@name",'f');
		Author test2 = new Author ("name1","name@name1",'0');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println("********************************************");
		
		char m='m';
		char f='f';
		char o='k';
		
		if (m==o || f==o){
			System.out.println("It is M or F");
		}else{ System.out.println("It is not M or F");
		}
		
	switch(o){
	case 'm':
		System.out.println("It is M");
		break;
	case 'f':
		System.out.println("It is F");
		break;
	default:
		System.out.println("Not in list");
		}
	
	}
}
