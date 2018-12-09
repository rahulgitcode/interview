package com.patterns.bridge;

public class UsedCar extends Vehicle{

	public UsedCar(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		workshop1.work();
		//workshop2.work();		
	}

}
