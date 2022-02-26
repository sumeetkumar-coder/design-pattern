package com.sumeet.design.pattern.factory;

public enum ColorEnum {

	RED("red"), BLUE("blue"), GREEN("green");

	private String colorName;

	private ColorEnum(String colorName) {
		this.colorName = colorName;
	}

	public String getColorName() {
		return colorName;
	}

	public static ColorEnum getColorEnum(String colorName) {
		
		for (ColorEnum c : ColorEnum.values()) {
			if (c.getColorName().equalsIgnoreCase(colorName)) {
				return c;
			}
		}
		
		return null;
	}

}
