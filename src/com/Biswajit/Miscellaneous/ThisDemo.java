package com.Biswajit.Miscellaneous;

public class ThisDemo {
	  int count;
	public static void main(String[] args) {

		ThisDemo td= new ThisDemo();
		td.process();
		//int count;
		
		
	}
	
	 void process(){
		 System.out.println("Count value:"+count);
			setCount(148);
			System.out.println("Updated Count:"+count);
		
	}

	 private void setCount(int count) {
		this.count=count;
	}

//"this" brings in the value of current objects as shown in blue. count in orange has local scops	
	 //used when parameter anmd property name is smae
}
