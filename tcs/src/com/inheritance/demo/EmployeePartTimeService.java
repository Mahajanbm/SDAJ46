package com.inheritance.demo;

import java.util.Scanner;

public class EmployeePartTimeService {
	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	EmployeePartTime e1=new EmployeePartTime();
	public void setPartTimeEmployee()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter  Employee ID");
		id=s1.nextInt();
		System.out.println("Enter  Employee Name");
		name=s1.next();
		System.out.println("Enter  Employee City");
		city=s1.next();
		System.out.println("Enter  Employee Dept");
		dept=s1.next();
		System.out.println("Enter  Employee Hr Salary");
		salary=s1.nextFloat();
		e1.setId(id);
		e1.setName(name);
		e1.setCity(city);
		e1.setDept(dept);
		e1.setHrsalary(salary);
	}
	public void getPartTimeEmployee()
	{
		System.out.println("Employee Id: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee city: "+e1.getCity());
		System.out.println("Employee Dept: "+e1.getDept());
		System.out.println("Employee Hr Salary: "+e1.getHrsalary());



	}
}
