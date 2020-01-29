package com.Biswajit.Strings;

public class StringDemo {

	public static void main(String[] args) {

		String name = "IBM";
		System.out.println(name);
		
		name=name+"Corp";
		System.out.println(name);
		
		String myName = "Biswa";
		
		String fullName = new String("Biswa");
		System.out.println(myName==fullName);   // this checks the object referensce not the content
		
		if(myName.equals(fullName)) //this checks whether 2 strings are same
		{
			System.out.println("same");
			
		}
		else {
			
			System.out.println("Not same");
		}
	}

}
