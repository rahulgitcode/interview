package com.patterns.bridge;

public class Truck extends Vehicle {

	public Truck(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.println("Truck");
		workshop1.work();
		workshop2.work();		
	}

}
