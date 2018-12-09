package com.patterns.bridge;

public class Service implements Workshop {

	@Override
	public void work() {
		System.out.println("Inspected and Serviced!");

	}

}
