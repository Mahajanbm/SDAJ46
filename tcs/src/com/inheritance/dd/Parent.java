package com.inheritance.dd;

public class Parent {

	public Parent() {
		System.out.println("this is Constructor of Parent");
	}

	public Parent( int x) {
		this();
		System.out.println("this is  parameterized Constructor of Parent");
	}

}
