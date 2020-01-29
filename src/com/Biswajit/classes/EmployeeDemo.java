package com.Biswajit.classes;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Employee application\n");
       Employee biswa= new Employee();
       biswa.setEmpDept("Engineer");
       //biswa.setEmpId(351);
       biswa.setEmpName("Biswajit");
       biswa.setProjectName("Kuch Bhi");
       
       System.out.println(biswa);
       
       EmployeeOps crud= new EmployeeOps();
       int empId= crud.createEmp(biswa);
       System.out.println("Generated Emp id: "+empId);
       
       biswa.setEmpId(empId);
       System.out.println(biswa);
	}

}
