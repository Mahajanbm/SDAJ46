package com.modifier.demo;

public class Parent1 {

	protected int id=10;

	protected Parent1()
	{

	}

	protected void demo()
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		Parent1 parent1=new Parent1();
		System.out.println(parent1.id);
		parent1.demo();

	}

}
