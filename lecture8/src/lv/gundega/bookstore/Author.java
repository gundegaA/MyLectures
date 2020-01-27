package lv.gundega.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	
	
	//constructor
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		if(checkGender(gender)){
		this.gender = gender;	
		}else{
			this.gender = 'X';
		}
		
	}
	//si ir metode
	public static boolean checkGender(char gender){
		char m='m';
		char f='f';
		if (m==gender || f==gender){
			System.out.println("It is M or F");
			return true;
		}else{
			return false;
		}
	}
	
	//getters and setters
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	
	
	

}
