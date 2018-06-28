package com.patterns.builder;

public class ComputerBuilder {
	private String cpu;
	private int ram;
	
	private boolean blueTooth;
	private boolean camera;
	
	public String getCpu() {
		return cpu;
	}
	public int getRam() {
		return ram;
	}
	public boolean isBlueTooth() {
		return blueTooth;
	}
	public boolean isCamera() {
		return camera;
	}
	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setBlueTooth(boolean blueTooth) {
		this.blueTooth = blueTooth;
		return this;
	}
	public ComputerBuilder setCamera(boolean camera) {
		this.camera = camera;
		return this;
	}
	
	public Computer build(){
		return new Computer(this);
	}
	
	

}
