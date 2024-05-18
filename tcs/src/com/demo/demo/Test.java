package com.demo.demo;

public class Test {
	public static void main(String[] args) {

		Service s1=new Service();
		s1.data();
		s1.display();

		GrandChild g1=new Service();
		g1.data();
		g1.display();


		Child c1=new Service();
		c1.data();
		c1.display();



		Parent p1=new Service();
		p1.data();


	}
}
