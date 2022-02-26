package com.sumeet.design.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {

		
		Phone phone = new Phone.PhoneBuilder("Apple",100.00)
				.addRam(128)
				.addScreenSize(6.5f)
				.build();
		
		System.out.println(phone.toString());
		
		Phone phone1 = new Phone.PhoneBuilder("Apple",100.00)
				.addprocessor("Android")
				.addBattery(40)
				.build();
		
		System.out.println(phone1.toString());
		

	}

}
