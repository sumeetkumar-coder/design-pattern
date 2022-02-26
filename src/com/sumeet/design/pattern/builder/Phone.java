package com.sumeet.design.pattern.builder;

public class Phone {

	private String name;
	private double price;
	private int battery;
	private String processor;
	private float screenSize;
	private int ram;
	
	private Phone(PhoneBuilder pb) {
		this.name = pb.name;
		this.price =pb.price;
		this.battery = pb.battery;
		this.processor = pb.processor;
		this.screenSize = pb.screenSize;
		this.ram = pb.ram;
	}
	
	public static class PhoneBuilder {
		
		private String name;
		private double price;
		private int battery;
		private String processor;
		private float screenSize;
		private int ram;
		
		public PhoneBuilder(String name, double price) {
			this.name = name;
			this.price =price;
		}
		
		public PhoneBuilder addBattery(int battery) {
			this.battery = battery;
			return this;
		}
		
		public PhoneBuilder addprocessor(String processor) {
			this.processor = processor;
			return this;
		}
		
		public PhoneBuilder addScreenSize(float screenSize) {
			this.screenSize = screenSize;
			return this;
		}
		
		public PhoneBuilder addRam(int ram) {
			this.ram = ram;
			return this;
		}
		
		public Phone build() {
			return new Phone(this);
		}
		
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getBattery() {
		return battery;
	}

	public String getProcessor() {
		return processor;
	}

	public float getScreenSize() {
		return screenSize;
	}

	public int getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + ", battery=" + battery + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", ram=" + ram + "]";
	}
	
	
	

}
