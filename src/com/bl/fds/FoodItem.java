package com.bl.fds;

import java.util.Objects;

public class FoodItem {
	

	enum Taste{
		SWEET, SALTY, SPICY; 
	}

	enum Type{
		VEG, NONVEG;
	}

	enum Category{
		STARTERS, MAINCOURSE, JUICES, SWEETS; 
	}

	protected Taste taste;
	protected int price;
	protected Type type;
	protected Category category;
	protected String name;

	@Override
	public String toString() {
		return "FoodItem{" +
				"taste=" + taste +
				", price=" + price +
				", type=" + type +
				", category=" + category +
				", name='" + name + '\'' +
				'}';
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FoodItem foodItem = (FoodItem) o;
		return Objects.equals(name, foodItem.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	public void setPrice(int price) {
		this.price = price;
	}


}


