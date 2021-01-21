import java.util.*;
public class Home {

	
	static ArrayList<Restaurant> Restaurant_List=new ArrayList<>();
	static ArrayList<User> User_List=new ArrayList<>();
	static ArrayList<Foods_In_Restaurant>list_of_all_foods=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Restaurant Owner: "+ "press : 1");
		System.out.println("             User "+ "press : 2");
		int press=sc.nextInt();
		
	//Based on if you are a Restaurant Owner or a user. You will be switched to appropriate case.
		
		switch(press) {
		  case 1:
			  System.out.println("Jupiter Foods Welcomes You!!!");
			  System.out.println("To Register Press: 1");
			  System.out.println("To Update Menue Press: 2");
			  System.out.println("To Update Order Limit Press: 3");
			  int res_press=sc.nextInt();
			  if(res_press==1){
				  Resaurant_Registration();
			  }else if(res_press==2){
				  Resaurant_Updation_Menue();
			  }else if(res_press==3){
				  Resaurant_Update_Order_limit();
			  }
			  
			  
			  
		    break;
		  case 2:
			  System.out.println("Jupiter Foods Welcomes You!!!");
			  User_Method();
			  
			  
		    break;
		  default:
		    // code block
		}
			
				
				
			
		
		

	}
	//***********************Restaurant Related Method **********************// 
	
	/*Restaurant can register it self!! This method will 
	 * generate a random id for the Restaurant and assign it to it.*/
	
	private static void Resaurant_Registration(){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		  System.out.println("Please provide Resturant Details: ");
		  System.out.println("Name of Resturant: ");
		  String name=sc.next();
		  System.out.println("Address of Resturant: ");
		  System.out.println();
		  System.out.println("First Address");
		  String FirstAddress=sc.next();
		  System.out.println();
		  System.out.println("Second Address");
		  String SecondAddress=sc.next();
		  
		  System.out.println("City");
		  String City=sc.next();
		  
		  
		  System.out.println("State");
		  String State=sc.next();
		  
		  System.out.println("Phone");
		  String Phone=sc.next();
		  
		  System.out.println("Pin");
		  String pin=sc.next();
		  
		  Address res_add=new  Address(FirstAddress, SecondAddress, City, State, Phone,pin);
		  
		  
		  int id=1000+rand.nextInt(100);
		  System.out.println("Your Restaurant Id is: "+ id);
		  Restaurant new_restaurant=new Restaurant(id,name,res_add);
		  Restaurant_List.add(new_restaurant);
		  System.out.println("Registration Succesfull!!");
		  main(null);
		return;
	}
	/*Restaurant can update its menu*/
	private static void Resaurant_Updation_Menue() {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Total number of restaurant: "+Restaurant_List.size());
	    System.out.println("Please Enter your restaurant id: ");
	    int res_id=sc.nextInt();
	    Restaurant rest_obj = null;
	    boolean falg=false;
	    for(int i=0;i<Restaurant_List.size();i++){
	    	System.out.println("Res_Id: "+Restaurant_List.get(i).getId());
	    	if(res_id==Restaurant_List.get(i).getId()){
	    		rest_obj=Restaurant_List.get(i);
	    		falg=true;
	    		break;
	    	}
	    }
	    if(falg==false){
	    	System.out.println("No Resturant found!! Please register first!!");
	    	 main(null);
	    	 return;
	    	
	    }
	    System.out.println("How many items you want to add: ");
	    int items=sc.nextInt();
	    for(int i=0;i<items;i++){
	    	
	    	System.out.println("Enter About "+ (i+1)+ "Food: ");
	    	System.out.println("Food Id: ");
	    	String food_id=sc.next();
	    	System.out.println("Food Name: ");
	    	String food_name=sc.next();
	    	System.out.println("Food Price :");
	    	String food_price=sc.next();
	    	System.out.println("Food Cuisine :");
	    	String food_cuisine=sc.next();
	    	Foods food=new Foods(food_id,food_name,food_price,food_cuisine);
	    	rest_obj.food_menu.add(food);
	    	
	    	boolean food_flag=false;
	    	for(int k=0;k<list_of_all_foods.size();k++){
	    		if(food_name.equals(list_of_all_foods.get(k).getFood().getFood_name())){
	    			list_of_all_foods.get(k).FoodInRestaurant.add(rest_obj);
	    			food_flag=true;
	    			break;
	    		}
	    	}
	    	if(food_flag==false){
	    		Foods_In_Restaurant foods_in_rest=new Foods_In_Restaurant(food);
	    		foods_in_rest.FoodInRestaurant.add(rest_obj);
	    		list_of_all_foods.add(foods_in_rest);
	    	}
	    	
	    	System.out.println("Food Added Successfully!!");
	    }
	    main(null);
		
	}
	
	/* This method deals with updation on order limit. If restaurant has lesser worker particular
	day owner/admin can reset order limit*/
	
	private static void Resaurant_Update_Order_limit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your restaurant id: ");
	    int res_id=sc.nextInt();
	    System.out.println("Please Enter order limit :  ");
	    int order_limit=sc.nextInt();
	    boolean falg=false;
	    for(int i=0;i<Restaurant_List.size();i++){
	    	System.out.println("Res_Id: "+Restaurant_List.get(i).getId());
	    	if(res_id==Restaurant_List.get(i).getId()){
	    		Restaurant_List.get(i).setOrder_limit(order_limit);
	    		falg=true;
	    		break;
	    	}
	    }
	    if(falg==false){
	    	System.out.println("No Resturant found!! Please register first!!");
	    	
	    	
	    }
	    main(null);
		
	}
	
	
	
	
	
	//********************************USER Related Methods!!! ****************************// 
	
	
	/*This method is responsible to call all other user related methods!!*/
	private static void User_Method() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press ");
		  System.out.println("1: For New User Registration");
		  System.out.println("2: For Updating your profile");
		  System.out.println("3: TO Delete Your Profile ");
		  System.out.println("4: TO See Your Profile ");
		  System.out.println("5: To search Restaurant ");
		  System.out.println("6: To search in all Foods ");
		  
		  int user_press=sc.nextInt();
		  if(user_press==1){User_Registration();}
		  else if(user_press==2){
			  System.out.println("Please Enter the mobile number: ");
			  String Mobile_Number_user=sc.next();
			  Update_Profile(Mobile_Number_user);
			  }
		  else if(user_press==3){
			  System.out.println("Please Enter the mobile number: ");
			  String Mobile_Number_user=sc.next();
			  Delete_Profile(Mobile_Number_user);}
		  else if(user_press==4){
			  System.out.println("Please Enter the mobile number: ");
			  String Mobile_Number_user=sc.next();
			  profile_fetch(Mobile_Number_user);
		  }else if(user_press==5){
			  System.out.println("name of Restaurant: ");
			  String res_name=sc.next();
			  Search_Restaurant(res_name);
		  }else if(user_press==6){
			  System.out.println("name of food: ");
			  String food_name_to_be_searched=sc.next();
			  Search_Food(food_name_to_be_searched);
			  
		  }else{
			  System.out.println("Please! make a valid Selection");
			  User_Method();
		  }
		
	}
	
	/* User can search any food. This method deals with it. This method will 
	 * take food name and search in food list*/
	private static void Search_Food(String food_name_to_be_searched) {
		Scanner sc=new Scanner(System.in);
		System.out.println(food_name_to_be_searched+ " food is available :");
		boolean flag=false;
		Foods food = null;
		for(int i=0;i<list_of_all_foods.size();i++){
			if(food_name_to_be_searched.equals(list_of_all_foods.get(i).getFood().getFood_name())){
				food=list_of_all_foods.get(i).getFood();
				ArrayList<Restaurant> restaurant_having_this_food=list_of_all_foods.get(i).FoodInRestaurant;
				for(int j=0;j<restaurant_having_this_food.size();j++){
					System.out.println(restaurant_having_this_food.get(j).getId()+" "+restaurant_having_this_food.get(j).getName());
				}
				flag=true;
				break;
			}
		}
		if(flag==false){System.out.println("No such food!!");}
		
		System.out.println("If you want to place an order please type yes else No: ");
		String user_command=sc.next();
		user_command=user_command.toLowerCase();
				
		if(user_command.equals("yes")){
			
			Place_an_order(food);
			return;
		}
		User_Method();
		
	}
	
	/*If user wants to place an order. This method deals with placing user order*/
	private static void Place_an_order(Foods food) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter restaurant id: ");
		int res_id=sc.nextInt();
		
		System.out.println("Please eneter user name: ");
		String user_name=sc.next();
		
		User user=null;
		for(int k=0;k<User_List.size();k++){
			if(user_name.equals(User_List.get(k).getName())){
				user=User_List.get(k);
				break;
			}
		}
		
		for(int i=0;i<Restaurant_List.size();i++){
			if(res_id==Restaurant_List.get(i).getId()){
				Restaurant restaurant=Restaurant_List.get(i);
			
				Order_Class order=new Order_Class(user,restaurant,food,"Processing");
				
				if(restaurant.getOrder_limit()==restaurant.orders.size()){
					System.out.println("This order can not be placed!! Please check another resturant!!");
					Place_an_order(food);
				}
				else{
					restaurant.orders.add(order);
					System.out.println("You order is in process!!");
				}
				
				break;
			}
		}
		User_Method();
		
	}
	
	/*User can search Restaurant . This method gives Restaurant with particular name. 
	 * It also displays the menu available there  */
	private static void Search_Restaurant(String res_name) {
		boolean falg=false;
		for(int i=0;i<Restaurant_List.size();i++){
			if(res_name.equals(Restaurant_List.get(i).getName().toString())){
				falg=true;
				Restaurant res_info=Restaurant_List.get(i);
			    System.out.println("Name: "+ res_info.getName());
			    Address res_add=res_info.getAddress();
			    System.out.println("Address: ");
			    System.out.println("First Address:  "+res_add.getFirst_Address());
			    System.out.println("Second Address:  "+res_add.getFirst_Address());
			    System.out.println("City:  "+res_add.getCity());
			    System.out.println("State:  "+res_add.getState());
			    System.out.println("Phone:  "+res_add.getPhone());
			    System.out.println("pin:  "+res_add.getPin());
			    
			    ArrayList<Foods>food_list=res_info.getFood_menu();
			    for(int j=0;j<food_list.size();i++){
			    	Foods food=food_list.get(i);
			    	System.out.println((i+1)+" : ");
			    	System.out.println("Food id: "+food.getFood_id());
			    	System.out.println("Food Name: "+food.getFood_name());
			    	System.out.println("Food Price: "+food.getPrice());
			    	System.out.println("Food Coisine: "+food.getCuisine());
			    }
			    break;
			}
		}
		if(falg==false){System.out.println("No such Restaurant with this name!!");}
		User_Method();
		
	}
	
	
	/*User can see his/her profile. This method deals with user profile*/
	private static void profile_fetch(String mobile_Number_user) {
		boolean flag=false;
		for(int i=0;i<User_List.size();i++){
			if(mobile_Number_user.equals(User_List.get(i).getMobile_number())){
				User user=User_List.get(i);
				System.out.println("Name: "+user.getName());
				System.out.println("Mobile: "+user.getMobile_number());
				Address add=user.getAddress();
				System.out.println("First Add: "+add.getFirst_Address());
				System.out.println("Second Add: "+add.getSecond_Address());
				System.out.println("City: "+add.getCity());
				System.out.println("State: "+add.getState());
				System.out.println("Mobile: "+add.getPhone());
				flag=true;
				break;
			}
			
		}
		if(flag==false){System.out.println("User not found!!");}
		User_Method();
		
	}
	
	
	/*User can delete profile. This method will take mobile number and delete user account related to it.*/
	private static void Delete_Profile(String mobile_Number_user) {
		boolean flag=false;
		
		if(User_List.size()==0){System.out.println("No Record Found!!");User_Method();}
		for(int i=0;i<User_List.size();i++){
			if(mobile_Number_user.equals(User_List.get(i).getMobile_number())){
				User_List.remove(i);
				System.out.println("User Profile Successfully Deleted!!");
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("No account found!!");
		}
		User_Method();
	}
	
	
	
	/*User can update his/her prfile. He/She can change name,mobile number,address*/
	private static void Update_Profile(String mobile_Number_user) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To change: ");
		System.out.println("Name: Press"+ " 1 ");
		System.out.println("Mobile Number: Press"+ " 2 ");
		System.out.println("Address: Press"+ " 3 ");
		int detail=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<User_List.size();i++){
			if(mobile_Number_user.equals(User_List.get(i).getMobile_number())){
				flag=true;
				User user=User_List.get(i);
				if(detail==1){
					System.out.println("Enter Name: ");
					String new_name=sc.next();
					user.setName(new_name);
					System.out.println("Name Successfully Updated!!");
					break;
				}
				else if(detail==2){
					System.out.println("Enter Mobile Number: ");
					String new_mobile=sc.next();
					user.setMobile_number(new_mobile);
					System.out.println("Mobile Number Successfully Updated!!");
					break;
				}else{
					System.out.println("Please enter new Address: ");
					System.out.println("First Address");
					  String First_Address=sc.next();
					  
					  System.out.println("Second Address");
					  String Second_Address=sc.next();
					  
					  System.out.println("City");
					  String User_City=sc.next();
					  
					  
					  System.out.println("State");
					  String User_State=sc.next();
					  
					  System.out.println("Phone");
					  String User_Phone=sc.next();
					  
					  System.out.println("Pin");
					  String User_pin=sc.next();
					  
					  Address user_add=new  Address(First_Address, Second_Address, User_City, User_State, User_Phone,User_pin);
					  
					  user.setAddress(user_add);
					  System.out.println("Address Successfully Updated!!");
					  break;
				}
			}
		}
		if(flag==false){System.out.println("No User Found!!");}
		
		User_Method();
	}
	
	
	/* User can register himself/herself*/
	private static void User_Registration() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide User Details: ");
		  System.out.println("Name: ");
		  String user_name=sc.next();
		  System.out.println("Mobile number: ");
		  String Mobile_number=sc.next();
		  
		  System.out.println("Address of User: ");
		  System.out.println("First Address");
		  String First_Address=sc.next();
		  
		  System.out.println("Second Address");
		  String Second_Address=sc.next();
		  
		  System.out.println("City");
		  String User_City=sc.next();
		  
		  
		  System.out.println("State");
		  String User_State=sc.next();
		  
		  System.out.println("Phone");
		  String User_Phone=sc.next();
		  
		  System.out.println("Pin");
		  String User_pin=sc.next();
		  
		  Address user_add=new  Address(First_Address, Second_Address, User_City, User_State, User_Phone,User_pin);
		  User new_user=new User(user_name,Mobile_number, user_add);
		  
		  User_List.add(new_user);
		  System.out.println("User Added Successfully!!");
		  User_Method();
		
	}
	

}
//*****************************This is not the end we can add more functionality **************// 