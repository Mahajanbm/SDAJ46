package com.modifier.demo;

public class Parent {
	private int id ;
	private String name; 

	private Parent()
	{
		System.out.println("Hello");
	}

	private void data()
	{
		System.out.println(id);
		System.out.println(name);
	}


	public static void main(String[] args) {

		Parent p1=new Parent();
		System.out.println(p1.id);
		System.out.println(p1.name);
		p1.data();
	}
}
