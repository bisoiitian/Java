package com.Biswajit.functions;

public class FinalMethodDemo {
    static final int value=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(value);
    
    //value=200;
    
    System.out.println("Updated value : " +value);
    //final variables can't be updaTED.
	}

}


class Data{
	
	void stdData()
	{
		System.out.println("Data.stdData");
		
	}
	
	 void splData()
	{
		System.out.println("Special");
	}
}

class CompanyData extends Data{
	@Override
	void stdData() {
		// TODO Auto-generated method stub
		super.stdData();
	}
	@Override
	void splData() {
		// TODO Auto-generated method stub
		super.splData();
	}
	
	
	
}