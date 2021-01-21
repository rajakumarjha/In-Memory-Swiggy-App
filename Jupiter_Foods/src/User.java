
public class User {
	private String name; //User input
	private String mobile_number; //User input
	private Address address; //User input
	
	
	public User(String name, String mobile_number, Address address) {
		
		this.name = name;
		this.mobile_number = mobile_number;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
