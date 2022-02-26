package com.sumeet.design.pattern.factory;

public class ColorFactory {

	public static Color getColor(String colorName) {
		
		 Color color;
		
		switch(ColorEnum.getColorEnum(colorName)) {
			
		case RED:
			color = new RedColor();
			break;
			
		case BLUE:
			color = new BlueColor();
			break;
			
		case GREEN:
			color = new GreenColor();
			break;
			
		default:
			throw new RuntimeException("Invalid color");
		}
		
		return color;
	}

}
