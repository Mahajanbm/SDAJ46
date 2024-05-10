package com.tcs.login;

public class Client {
	public static void main(String[] args) {
		Test t1=new Test();
		System.out.println(Test.id);
		System.out.println(t1.name);
		System.out.println(t1.city);
		System.out.println(t1.salary);
		t1.getData();
		Test.display();
	}
}
