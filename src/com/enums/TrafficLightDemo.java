package com.enums;

public class TrafficLightDemo {
	
	public static void main(String[] args) {
		TrafficLightController tc = new TrafficLightController(TrafficLight.GREEN);
		
		for(int i=0; i<10; i++) {
			System.out.println(tc.getColor());
			tc.waitForChange();
		}
		tc.cancel();
	}

}
