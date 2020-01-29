package com.Biswajit.demo;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 Functions fn= new Functions();
	 int a, b;
	 String ch;
	 System.out.println("Enter two numbers:\n");
	 a= sc.nextInt();
	 b= sc.nextInt();
	 fn.add(a, b);
	 for(;;)
	 {
		 System.out.println("Enter y to continue, exit to exit\n");
		 
		 ch= sc.nextLine();
		 if(ch.equals("y"))
		 {
			 System.out.println("Enter two numbers:\n");
			 a= sc.nextInt();
			 b= sc.nextInt();
			 fn.add(a, b);
		 }
		 else if(ch.equals("exit"))
		 {
			 System.out.println("Thank You");
			 System.exit(0);
			 
		 }
		 /*else
		 {
			 System.out.println("Wrong input try again\n");
		 }*/
	 }
	}

}
