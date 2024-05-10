package com.amazon.demo;

public class TestD {
	public static void main(String[] args) {
		Parent p1=new Parent();
		Child c1=new Child();
		c1.demo();
		System.out.println(p1 instanceof Child);
		System.out.println(c1 instanceof Parent);
	}
}
