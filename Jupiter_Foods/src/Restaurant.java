import java.util.*;
public class Restaurant {
	
	private int id; // Will be generated dynamically at run time.
	private String name; // Owner input
	private Address address; // Owner input
	private int order_limit; //// Owner input and can be updated later based on need
	
	ArrayList<Foods>food_menu=new ArrayList<>();
	Queue<Order_Class>orders=new LinkedList<>();
	


	
	
	public Restaurant(int id,String name, Address address) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getOrder_limit() {
		return order_limit;
	}
	public void setOrder_limit(int order_limit) {
		this.order_limit = order_limit;
	}
	public ArrayList<Foods> getFood_menu() {
		return food_menu;
	}
	public void setFood_menu(ArrayList<Foods> food_menu) {
		this.food_menu = food_menu;
	}
	public Queue<Order_Class> getOrders() {
		return orders;
	}
	public void setOrders(Queue<Order_Class> orders) {
		this.orders = orders;
	}

	
	
}
