package com.sumeet.design.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {

		Color c = ColorFactory.getColor("red");

		System.out.println(c.displayColor());
		
		Color c1 = ColorFactory.getColor("green");

		System.out.println(c1.displayColor());
		
		Color c2 = ColorFactory.getColor("Blue");

		System.out.println(c2.displayColor());

	}

}
