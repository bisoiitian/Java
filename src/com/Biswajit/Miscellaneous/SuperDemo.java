package com.Biswajit.Miscellaneous;

public class SuperDemo {

	public static void main(String[] args) {
		
     ServiceCompany sc= new ServiceCompany();
     sc.info();
     
	}

}

class Company{

	public Company(int val) {
		super();
		//alt+shift+s for constructor
		System.out.println("Company.Company()");
		System.out.println(val);
	}
	
	void info() {
		System.out.println("Company.info()");
	}
	
}

class ServiceCompany extends Company{

	public ServiceCompany() {
		super(24);
	}

	//complirer creates constructor implicitly from super class
	
	
	
	
}