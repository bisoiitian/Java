package com.Biswajit.Miscellaneous;

public class ObjectDemo {

	public static void main(String[] args) {
//object is the superclass for every class
		Mobile m= new Mobile();
		m.getType();
		m.screenSize();
		m.toString();
		
		Object mob= new Mobile();
		
	}

}

class Mobile extends Keyboard{
	
	void screenSize() {
		
		
	}
	
}

class Keyboard
{
	void getType() {
		
	}
}