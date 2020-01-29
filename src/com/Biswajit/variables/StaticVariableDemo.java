package com.Biswajit.variables;

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vendor vm= new Vendor();
      vm.createVentor("Rahul");
      
      vm.totalVendors();
      
      Vendor hungerb= new Vendor();
      hungerb.createVentor("Food Service");
      hungerb.totalVendors();
      
      Vendor water= new Vendor();
      water.totalVendors();
	}

}

//instance varible scope in a instal
//global variale has full scope
//variable has 3 access specifier
//classes only have public and defaul access specifier
class Vendor{
	
	 static int totalVendors;
	// global variables share the same copy through all objects.
	 //mentioned with static before it.
	void createVentor(String name)
	{
		
		System.out.println("Craeting a vendor:"+name+"\n");
		totalVendors++;
		
	}
	
	 void totalVendors(){
		
		System.out.println(" No of vendors:"+totalVendors);
	}
}