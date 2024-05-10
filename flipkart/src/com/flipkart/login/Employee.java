package com.flipkart.login;

public class Employee {
	int y=50;//non-static variable
	
	 void demo()//it is non-static method
	 {
		 System.out.println(y);
	 }
	
	
	public static void main(String[] args) {// it is static method
		int x=10;//local variable
		System.out.println(x);
		Employee e1=new Employee();
		System.out.println(e1.y);
		e1.demo();
	}
}
