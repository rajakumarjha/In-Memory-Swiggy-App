import java.util.*;

/*This class will store one food and a list of restaurant which will be having that food */
public class Foods_In_Restaurant {
	private Foods food;
	ArrayList<Restaurant>FoodInRestaurant=new ArrayList<>();
	
	
	
	public Foods_In_Restaurant(Foods food) {
		super();
		this.food = food;
	}
	public Foods getFood() {
		return food;
	}
	public void setFood(Foods food) {
		this.food = food;
	}
	public ArrayList<Restaurant> getFoodInRestaurant() {
		return FoodInRestaurant;
	}
	public void setFoodInRestaurant(ArrayList<Restaurant> foodInRestaurant) {
		FoodInRestaurant = foodInRestaurant;
	}

	
}
