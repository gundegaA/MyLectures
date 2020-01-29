package lv.gundega.users;

public class Person {
	
	private String name;
	private String address;
	
	public Person (String vards, String adrese){
		this.name = vards;
		this.address =adrese;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}

	
	public String toString() {
		return this.name+" (" +this.address+")";
	}
	
	
	
	

}
