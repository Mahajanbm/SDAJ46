package com.flipkart.electronics;

public class DemoTest {
	public static void main(String[] args) {
		//Student s1=new Student();
		GrandChild c1=new GrandChild();
		c1.data();
		c1.demo();
		//Student s1=new Child();
		//s1.data();
		//s1.demo();

		Student s1=new GrandChild(); //reference creation in java
		s1.data();
		s1.demo();


		Child c2=new Child();
		c2.data();
		Student c3=new Child();
		c3.data();



	}

}
