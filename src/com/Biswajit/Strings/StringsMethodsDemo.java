package com.Biswajit.Strings;

public class StringsMethodsDemo {

	public static void main(String[] args) {

		String name = "IBM Cloud Indiua";
		System.out.println(name.indexOf("C"));
		
	
		System.out.println(name.substring(4,9));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.replaceAll(" ", "_"));
		
		System.out.println(name.contains("lab"));
	}

}
