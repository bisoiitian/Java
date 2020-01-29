package com.Biswajit.Miscellaneous;

public class ArrayDemo {
    
   static int[] marks; //declaration
   static int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int cal=100;
      //never use 1,2,3 in variable name
      int marks1,marks2,marks3;
      //arrays are objects
      //int[] marks;
      marks= new int[5];
      marks[0]=55;
      marks[1]=66;
      marks[2]=77;
     marks[3]=88;
     //mArks will be instack, marks data is stored in heap
      marks= new int[5];  //initialization of array
     // val= new int; //this is wrong, only for array
      System.out.println("Marks:"+marks);
      System.out.println("val="+val);
      
      float[] appraisalrating= {3.5f,4.7f,78.2f, 3.8f};  //dynamic initialization
      System.out.println(appraisalrating[4]);
	}

}
