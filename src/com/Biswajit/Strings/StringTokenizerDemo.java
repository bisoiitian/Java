package com.Biswajit.Strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		
		String name = args[0];
		System.out.println(name);
		
		String[] names =name.split(" ");
		for (String string : names) {
			System.out.println(string);
		}
		
		
		System.out.println(".......");
		//it tokenizes the satring, on the basis of the delimeter, in this case it is space.
		StringTokenizer nameTokens= new StringTokenizer(name, " ");
		while(nameTokens.hasMoreTokens()) {
			
			System.out.println(nameTokens.nextToken());
			//nextToken returns string whereas nextElement returns object
		}
		
	}

}
