package com.patterns.builder;

public class Computer {
	
	private String cpu;
	private int ram;
	
	private boolean blueTooth;
	private boolean camera;
	
	Computer(ComputerBuilder builder){
		this.cpu = builder.getCpu();
		this.ram = builder.getRam();
		this.blueTooth = builder.isBlueTooth();
		this.camera = builder.isCamera();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerBuilder builder = new ComputerBuilder();
		Computer computer = builder.setBlueTooth(true).setCamera(false).setCpu("INTEL").setRam(1500).build();
		
		System.out.println(computer.blueTooth);
		System.out.println(computer.camera);
		System.out.println(computer.cpu);
		System.out.println(computer.ram);

	}

}
