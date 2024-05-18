package com.inheritance.demo;

import java.util.Scanner;

public class EmployeeFullTimeService {

	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	EmployeeFullTime e1=new EmployeeFullTime();
	Scanner s1=new Scanner(System.in);
	public void setFullTimeEmployee()
	{
	
		System.out.println("Enter  Employee ID");
		id=s1.nextInt();
		System.out.println("Enter  Employee Name");
		name=s1.next();
		System.out.println("Enter  Employee City");
		city=s1.next();
		System.out.println("Enter  Employee Dept");
		dept=s1.next();
		System.out.println("Enter  Employee Monthly Salary");
		salary=s1.nextFloat();
		e1.setId(id);
		e1.setName(name);
		e1.setCity(city);
		e1.setDept(dept);
		e1.setMonthlysalary(salary);
	}
	public void getFullTimeEmployee()
	{
		System.out.println("Employee Id: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee city: "+e1.getCity());
		System.out.println("Employee Dept: "+e1.getDept());
		System.out.println("Employee Monthly Salary: "+e1.getMonthlysalary());



	}
}
