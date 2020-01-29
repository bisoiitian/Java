package com.Biswajit.Miscellaneous;

public class StaticBlockDemo {
   public static void main(String[] args) {
	   
	   new Check();
	/*Check c = new Check();
	Check c1 = new Check();
	Check c2 = new Check();
	Check c3 = new Check();
	   */
  }
}
class Check{
	static{
		System.out.println("Corporate static block");
		//runs only once when loaded by jvm
		//runs first, before constructor, before block
	}
	{//instance block is run whenever object is created
		System.out.println("check object getting created..\n");
	}

	public Check() {
		super();
		System.out.println("Check.Check()");
		// TODO Auto-generated constructor stub
	}
	
	
}