package com.example.pkg;

import java.util.List;
import java.util.Map;

public class Animal {

	private String speciesName;
	private Color color;
	private Size size;
	private List<String> names;
	private Map<Integer,String> food;

	public Animal(){

	}
	

	public Map<Integer, String> getFood() {
		return food;
	}


	public void setFood(Map<Integer, String> food) {
		this.food = food;
	}


	public List<String> getNames() {
		return names;
	}


	public void setNames(List<String> names) {
		this.names = names;
	}


	public Animal(String speciesName, Color color, Size size) {
		super();
		this.speciesName = speciesName;
		this.color = color;
		this.size = size;
	}
	
	public Animal(Customer cust) {
		
		super();	
		System.out.println("hey");
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	
}
