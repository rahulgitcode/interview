package com.patterns.prototype;

public class BlueColor extends Color{
	
	public BlueColor() {
		this.colorName = "blue";
	}
	
	@Override
	public void addColor() {
		System.out.println("blue color added");	
	}

}
