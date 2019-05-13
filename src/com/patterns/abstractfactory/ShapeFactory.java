package com.patterns.abstractfactory;

public class ShapeFactory {
	
	public static void main(String[] args){
		String shapeType= "round";
		//String shapeType= "regular";
		
		String shape = "square";
		//String shape = "rectangle";
		
		AbstractFactory shapeFactory;
		if(shapeType.equals("regular")){
			shapeFactory = new RegularShapeFactory();
		}else{
			shapeFactory = new RoundedShapeFactory();
		}
		
		shapeFactory.getFactory(shape).draw();
		
	}

}
