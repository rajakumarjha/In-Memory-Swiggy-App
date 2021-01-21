
public class Address {

	
	// This class is used to store  address of both user and restaurant. 
	//Both user and Restaurant class will be having this filed as their property
	private String First_Address;
	private String Second_Address;
	private String City;
	private String state;
	private String phone;
	private String pin;
	
	
	
	public Address(String first_Address, String second_Address, String city,
			String state, String phone, String pin) {
		super();
		First_Address = first_Address;
		Second_Address = second_Address;
		City = city;
		this.state = state;
		this.phone = phone;
		this.pin = pin;
	}
	
	
	public String getFirst_Address() {
		return First_Address;
	}
	public void setFirst_Address(String first_Address) {
		First_Address = first_Address;
	}
	public String getSecond_Address() {
		return Second_Address;
	}
	public void setSecond_Address(String second_Address) {
		Second_Address = second_Address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
