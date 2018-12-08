package com.enums;

public class EnumMethods {
	
	enum Transport{
		CAR(40), BUS(20), PLANE(100), TRAIN(80);
		
		int speed;
		
		Transport(int s){
			speed = s;
		}
		
		public int getSpeed() {
			return speed;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("the speed of car is "+ Transport.CAR.getSpeed());
	}

}
