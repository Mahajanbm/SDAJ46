package com.exmple.demo;

import java.util.Scanner;

public class StudentService {

	Scanner s1=new Scanner(System.in);
	Student s2=new Student();
	public  void setData()
	{
		System.out.println("Enter Student Id");
		int id=s1.nextInt();

		System.out.println("Enter Student Name");
		String name=s1.next();

		System.out.println("Enter Student City");
		String city=s1.next();

		System.out.println("Enter Student Per");
		float per=s1.nextFloat();

	
		s2.setId(id);
		s2.setName(name);
		s2.setCity(city);
		s2.setPer(per);



	}

	public void display()
	{
		System.out.println("Student id is: "+s2.getId());
		System.out.println("Student Name is: "+s2.getName());
		System.out.println("Student city is: "+s2.getCity());
		System.out.println("Student Per is: "+s2.getPer());

	}

}
