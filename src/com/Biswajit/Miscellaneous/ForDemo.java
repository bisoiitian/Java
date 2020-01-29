package com.Biswajit.Miscellaneous;

import java.util.Iterator;

public class ForDemo {

	public static void main(String[] args) {

		
//		for (int i = 0; i < args.length; i++) {
	//		
		//}
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
			
		}
		
		System.out.println("............");
/*
 * 		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
 *
 *
 *
 *
*
*		type type = (type) iterator.next();
*/			
//		}
		for (String string : args) {
			System.out.println(string);
		}
	}

}
