package com.patterns.bridge;

public class Component implements Workshop {

	@Override
	public void work() {
		System.out.println("Components built");

	}

}
