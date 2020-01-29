package com.Biswajit.functions;

public class FinalClassDemo {

	public static void main(String[] args) {
		//final class can't be inherited
		//final method can't  be overriden
		AdditionalInfo ai = new AdditionalInfo();
		ai.getInfo();
	}
	
}

final  class Info{
	void getInfo()
	{
		System.out.println("Info.getInfo()");
	}
}
class AdditionalInfo {
	
	void getInfo()
	{
		Info i= new Info();
		i.getInfo();
		
	}
}