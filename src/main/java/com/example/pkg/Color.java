package com.example.pkg;

public class Color {
	private String colorName;
	private int colorId;
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public Color(String colorName, int colorId) {
		super();
		this.colorName = colorName;
		this.colorId = colorId;
	}
	
	

}
