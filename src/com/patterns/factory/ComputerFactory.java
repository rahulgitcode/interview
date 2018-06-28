package com.patterns.factory;

public class ComputerFactory {
	
	public Computer getComputer(String type){
		if("lenovo".equalsIgnoreCase(type) || "hp".equalsIgnoreCase(type)){
			return new PC();
		}else{
			return new Mac();
		}
	}

}
