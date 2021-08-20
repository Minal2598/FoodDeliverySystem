package com.bl.fds;

import java.util.*;
import java.util.stream.Collectors;

public class FoodDataLayer {
	private static FoodDataLayer instance;
	static Scanner sc = new Scanner(System.in);
	Set<FoodItem> foodList = new HashSet<>();

	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}

	public void print() {
		for (FoodItem foodItem : foodList) {
			System.out.println(foodItem);
		}
	}

	public void delete(FoodItem foodItem) {
		foodList.remove(foodItem);
	}

	public FoodItem getFoodItem(String name) {
		/*for(FoodItem foodItem : foodList){
			if (foodItem.name.equalsIgnoreCase(name)){
				return foodItem;
			}
		}*/
		if(foodList.size() > 0) {
			return foodList.stream().filter(foodItem -> foodItem.name.equalsIgnoreCase(name))
					.collect(Collectors.toList()).get(0);
		} else {
			return null;
		}

		//return list.get(0);

	/*	for (int i = 0; i < foodList.size(); i++) {
			if (name.equals(foodList.get(i).name)) {
				return foodList.get(i);
			}
		}*/
	}
	void addFoodItem() {
		FoodItem foodItems  = new FoodItem();
		System.out.println("Enter food name  ");
		foodItems.name = sc.next().concat(sc.nextLine());

		System.out.println("Enter food type");
		System.out.println("1.Veg 2.NoNVeg");
		int choice = sc.nextInt();
		switch (choice) {
			case 1 :
				foodItems.type = FoodItem.Type.VEG;
				break;
			case 2 :
				foodItems.type = FoodItem.Type.NONVEG;
				break;
		}
		System.out.println("enter food categoery:: 1- MAINCOURSE 2-STARTERS 3-JUICES 4-SWEETS");
		int catType  = sc.nextInt();
		switch (catType) {
			case 1 :
				foodItems.category = FoodItem.Category.MAINCOURSE;
				break;
			case 2:
				foodItems.category = FoodItem.Category.STARTERS;
				break;
			case 3:
				foodItems.category = FoodItem.Category.JUICES;
				break;
			case 4:
				foodItems.category = FoodItem.Category.SWEETS;
				break;

			default:
				System.out.println("Enter right Category.");
		}
		System.out.println("Enter taste :: 1. spicy 2.salty 3.sweets");
		int tasteChoice = sc.nextInt();
		switch (tasteChoice){

			case 1 :
				foodItems.taste = FoodItem.Taste.SPICY;
				break;
			case 2 :
				foodItems.taste = FoodItem.Taste.SALTY;
				break;
			case 3 :
				foodItems.taste = FoodItem.Taste.SWEET;
				break;

		}
		System.out.print("Enter price :: ");
		int price = sc.nextInt();
		foodItems.price = price;
		foodList.add(foodItems);
	}
}