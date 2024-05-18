package com.modifier.demo;

public class Data {

	int a=10;
	Data() {

	}
	void demo()
	{
		System.out.println("This is dempo method");	
		System.out.println(a);
	}
	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println(d1.a);
		d1.demo();
	}

}
