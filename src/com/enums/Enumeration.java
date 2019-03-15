package com.enums;

enum Banna{
	RED, YELLOW, GREEN
}

public class Enumeration {

	public static void main(String[] args) {
		System.out.println(Color.YELLOW);
		
		Banna[] Colors = Banna.values();
		
		for(Banna c: Colors){
			System.out.println(c + " at index "+c.ordinal());
			
		}
		System.out.println(Color.valueOf("RED"));
	}

}
