package com.demo.example;

public class Student {

	void getData()
	{
		System.out.println("This is GetData MEthod with zero Parameter");
	}

	void getData( int id)
	{
		System.out.println("This is GetData MEthod with int Parameter");
	}

	void getData( String x)
	{
		System.out.println("This is GetData MEthod with String Parameter");
	}

	public static void main(String[] args) {

		Student s1=new Student();
		s1.getData();
	}

}
