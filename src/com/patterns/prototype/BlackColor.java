package com.patterns.prototype;

public class BlackColor extends Color {
	
	public BlackColor() {
		this.colorName = "black";
	}
	@Override
	public void addColor() {
		System.out.println("black color added");
		
	}

}
