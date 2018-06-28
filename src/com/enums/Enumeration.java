package com.enums;

enum Color{
	RED, YELLOW, GREEN
}

public class Enumeration {

	public static void main(String[] args) {
		System.out.println(Color.YELLOW);
		
		Color[] Colors = Color.values();
		
		for(Color c: Colors){
			System.out.println(c + " at index "+c.ordinal());
			
		}
		System.out.println(Color.valueOf("RED"));
	}

}
