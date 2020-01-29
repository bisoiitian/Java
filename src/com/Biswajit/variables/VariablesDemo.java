package com.Biswajit.variables;

public class VariablesDemo {

	
	 static int level;
	//instance variable are commo accross all methods or peers
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//variable in a method= local viariable
		int count =10; //local variable
		
		System.out.println(count);
		//local variable should be initialized before using
		
		System.out.println(level);
		//calculate();
		
	}
    void calculate()
   {
	   System.out.println(level);
	   // error coz count has local scope
   }
}
