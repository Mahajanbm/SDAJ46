package com.singleton.demo;

public class Client {
	public static void main(String[] args) {

		int a=Parent.id();//10   //12345
		//12345
		int b=Parent.id();//10
		System.out.println(a==b);
	}
}
