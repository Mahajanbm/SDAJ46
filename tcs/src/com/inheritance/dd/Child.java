package com.inheritance.dd;

public class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("this is Constructor of Child");
	}
	public Child( int y) {
		this();
		System.out.println("this is parameterized Constructor of Child");
	}
}
