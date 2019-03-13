package com.enums;

enum Color{
	RED, YELLOW, BLUE, GREEN
}

enum Transport{
	CAR, BUS, BIKE, BOAT
}

public class EnumExample {
	

	public static void main(String[] args) {
		Color c = Color.BLUE;
		System.out.println(c);
		
		Banna[] colors = Banna.values();
		System.out.println("Here are all the colors....");
		for(Banna x: colors){
			System.out.println(x);
		}
		
		switch(c){
		case RED:
			System.out.println("Its RED!");
			break;
		case GREEN:
			System.out.println("Its GREEN!");
			break;
		default:
			System.out.println("No color found");
		}
		
		
		System.out.println(Banna.valueOf("YELLOW"));
		
		System.out.println(Transport.valueOf("CAR"));
	}

}
