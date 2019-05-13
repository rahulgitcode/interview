package com.patterns.abstractfactory;

public class RegularShapeFactory extends AbstractFactory{

	@Override
	public Shape getFactory(String shapeType) {
		if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

}
