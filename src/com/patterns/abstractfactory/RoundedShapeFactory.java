package com.patterns.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getFactory(String shapeType) {
		if(shapeType.equalsIgnoreCase("square")){
			return new RoundSquare();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new RoundRectangle();
		}
		return null;
	}

}
