package com.Biswajit.functions;

public class StaticKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Company ibm= new Company();
       ibm.getFounder(); //normal way
       Company.getFounder(); //static way
       
       System.out.println("Kuch Bhi");
	}

}
//static can't be applied to a class, it can only be put to methods,variables, blocks.
//static methods can access only stativ variables
class Company{
	
	static void getFounder()
	{
		System.out.println("Thomas JJ watson");
	}
}