package com.patterns.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		Vehicle toyotaCar = new Car(new Component(), new Assemble());
		toyotaCar.manufacture();
		
		Vehicle toyotaTruck = new Truck(new Component(), new Assemble());
		toyotaTruck.manufacture();
		
		Vehicle usedCar = new UsedCar(new Service(), null);
		usedCar.manufacture();

	}

}
