package com.Biswajit.Miscellaneous;

public class ThisMethodDemo {

	public static void main(String[] args) {
        Computer dell= new Computer("Dell", "Vostro", (byte)45);
        System.out.println(dell);
	}

}

class Computer {

	String manufacturer;
	String model;
	byte ram;
	//byte hdd;
	//byte screenSize;

	public Computer(String manufacturer, String model) {
		this.manufacturer = manufacturer;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", ram=" + ram + "]";
	}

	public Computer() {

	}

	public Computer(String manufacturer, String model, byte ram) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.ram = ram;
		/*
		 * Or we can do this;
		 * this(manufacturer, model);
		 * this refers to the other constructor and gets the value for us.
		 * so if 2 variables are already coinstructed then in the 3 variable u can referv it to other
		 * 
		 */
	}

}