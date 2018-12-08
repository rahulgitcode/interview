package com.patterns.prototype;

public class Prototype {
	
	public static void main(String[] args) {
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
	}

}
