package com.oops.demo;
public class Student {
	private int id;
	private	String name;
	private	String city;
	private float per;
	private String state;
	private String country;
	private String mobile;

	void getData(int id,String name,String city,float per,String state,String country,String mobile)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.per=per;
		this.state=state;
		this.country=country;
		this.mobile=mobile;

	}
	void display()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("City is: "+city);
		System.out.println("per is: "+per);

		System.out.println("State:  "+state);
		System.out.println("COuntry is: "+country);
		System.out.println("Mobile is: "+mobile);
	}
}
