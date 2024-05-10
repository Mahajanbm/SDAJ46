package com.amazon.demo;

public class Student {
	int rollno;
	String name;//variables
	String city;
	float salary;
	
	void getData(int a,String b,String c,float d)//parameters
	{
		rollno=a;//101
		name=b;
		city=c;
		salary=d;
	}
	void display()
	{
		System.out.println("Rollno is: "+rollno);
		System.out.println("Name is: "+name);
		System.out.println("city is: "+city);
		System.out.println("salary is: "+salary);
	}
}
