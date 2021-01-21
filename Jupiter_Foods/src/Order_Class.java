import java.util.*;
public class Order_Class {

	// This class object will store the order information. When an order is placed!!
	private User user;
	private Restaurant restaurant ;
	private Foods food;
	private String Status;
	
	
	
	public Order_Class(User user, Restaurant restaurant,
			Foods food, String status) {
		super();
		this.user = user;
		this.restaurant = restaurant;
		this.food = food;
		Status = status;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	public Foods getFood() {
		return food;
	}

	public void setFood(Foods food) {
		this.food = food;
	}

	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
