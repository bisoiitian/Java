package com.Biswajit.Practice;

import java.util.Scanner;
public class EmployeeDemo {

	static int i=0;
	static int ch;
	 static Scanner sc= new Scanner(System.in);
	 static Employee emp[]= new Employee[100];
	public static void main(String[] args) {

    for(;;) {
     System.out.println("Choose 1/2/3/4/5 for creation/retreival/updation/deletion/exit");
     ch= Integer.parseInt(process(sc)) ;    
     
     switch(ch) {
     
     case 1: create();
    	 break;
    	 
     case 2:  retrieve();
    	 break;
     case 3:  update();
    	 break;
     case 4:  delete();
    	 break;
     case 5:  System.out.println("Thank you");
              System.exit(0);
    	 break;
     default:System.out.println("Wrong input, try again");	 
     }
    } 
}
	
	private static void delete() {
        int index = 0;
		System.out.println("Enter EmployeeId of the person you wish to retreive information of");
		int empid = Integer.parseInt(process(sc));
		for(int j=0;j<i;j++)
		{
			if(empid==emp[j].empId)
			{
				 index = j;
				break;
			}
			
		}
		System.out.println("The record deleted is:"+emp[index]);
		emp[index]= null;
		
	}

	private static void update() {

		int empid, index=0; String newData;
	    System.out.println("Enter EmployeeId of the person you wish to retreive information of");
		empid=Integer.parseInt(process(sc));
		System.out.println("Choose 1/2 to update project/department");
		int updation=Integer.parseInt(process(sc));
		for(int j=0;j<i;j++)
		{
			if(empid==emp[j].empId)
			{
				index=j;
				break;
			}
			
		}

		System.out.println("the original data is:"+emp[index]);
		switch(updation) {
		case 1: System.out.println("Enter new Project");
		        newData=process(sc);
		        emp[index].project=newData;
		        break;
		case 2: System.out.println("Enter new Department");   
                newData=process(sc);
                emp[index].department=newData;
                
	            break;
		}
		
		System.out.println("the Updated data is:"+emp[index]);
		
		
	}

	private static void retrieve() {
		int empid, flag=0;
	    System.out.println("Enter EmployeeId of the person you wish to retreive information of");
		empid=Integer.parseInt(process(sc));
		for(int j=0;j<i;j++)
		{
			if(empid==emp[j].empId)
			{
				System.out.println("Profile Found!!");
				System.out.println(emp[j]);
				flag=1;
				break;
			}
			
		}
		if(flag!=1)
		{
			System.out.println("Profile not Found, Try another Employee");
		}

		        
		
	}

	private static void create() {
		System.out.println("Enter Employee Id, name, department, project");
		int empId= Integer.parseInt(process(sc));
		String name= process(sc);
		String dept= process(sc);
		String project= process(sc);
		emp[i]= new Employee(name, project, dept, empId);
		System.out.println("The profile is created");
		System.out.println(emp[i]);
		i++;
	}

	static String process(Scanner scan) {
		
		return (scan.nextLine());
	}
}