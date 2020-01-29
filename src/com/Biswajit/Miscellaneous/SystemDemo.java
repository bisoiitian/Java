package com.Biswajit.Miscellaneous;

public class SystemDemo {
//system doesn't have any super class
	public static void main(String[] args) {

		System.out.println("Hello");
		System.err.println("Warning");// primts oin red
		
		System.out.println("SystemDemo.main()");
		String name ="Ravi Kiran";
		int empNo=282;
		System.out.println("Employee ("+name+") Id is("+empNo+")");
		
		System.out.printf("Employee(%s) id is (%d)", name, empNo); //printf stands for print format.
	}

}
