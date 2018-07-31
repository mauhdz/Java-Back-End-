package com.example.pkg;

public class Size {
	private double weight;
	private double height;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Size(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}
}
