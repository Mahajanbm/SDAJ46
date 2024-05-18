package com.singleton.demo;

public class Parent {

	static	int x=10;
	private Parent()
	{
		System.out.println("Hello");

	}
	public static int id()
	{
		return x;
	}


}
