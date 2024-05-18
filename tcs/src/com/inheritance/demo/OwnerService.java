package com.inheritance.demo;

import java.util.Scanner;

public class OwnerService  {	
	private int id;
	private String name;
	private String city;
	private String dept;
	private float salary;
	Owner e1=new Owner();
	public void setPartTimeEmployee()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter  Owner ID");
		id=s1.nextInt();
		System.out.println("Enter  Owner Name");
		name=s1.next();
		System.out.println("Enter  Owner City");
		city=s1.next();
		System.out.println("Enter  Owner Dept");
		dept=s1.next();
		System.out.println("Enter  Owner TurnOver");
		salary=s1.nextFloat();
		e1.setId(id);
		e1.setName(name);
		e1.setCity(city);
		e1.setDept(dept);
		e1.setTurnover(salary);
	}
	public void getFullTimeEmployee()
	{
		System.out.println("Owner Id: "+e1.getId());
		System.out.println("Owner Name: "+e1.getName());
		System.out.println("Owner city: "+e1.getCity());
		System.out.println("Owner Dept: "+e1.getDept());
		System.out.println("Owner TurnOver: "+e1.getTurnover());



	}

}
