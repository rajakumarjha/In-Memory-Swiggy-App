import java.util.*;
public class Foods {
    // Restaurant owner/admin can add,update the foods once registration is done!!
	private String food_id; 
	private String food_name;
	private String price;
	private String Cuisine;
	
	
	
	public Foods(String food_id,String food_name, String price, String cuisine) {
		super();
		this.food_id=food_id;
		this.food_name = food_name;
		this.price = price;
		Cuisine = cuisine;
	}
	
	
	public String getFood_id() {
		return food_id;
	}


	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}


	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	
	
	
}
