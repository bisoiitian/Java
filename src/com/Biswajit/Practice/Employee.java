package com.Biswajit.Practice;

public class Employee {
     String name, project, department;
     int empId;
	public Employee(String name, String project, String department, int empId) {
		
		this.name = name;
		this.project = project;
		this.department = department;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", project=" + project + ", department=" + department + ", empId=" + empId
				+ "]";
	}
     
}
