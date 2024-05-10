package com.flipkart.login;


public class Client {
	static{
		System.out.println("this is static block");
	}
	{
		System.out.println("This is non-static block in java");
	}
	{
		System.out.println("This is non-static block1 in java");
	}
	void demo()
	{
		Client c1=new Client();
	}
	public static void main(String[] args) {
		Product p1=new Product();
		Client c1=new Client();
		c1.demo();
		System.out.println("This is main method");
		Client c2=new Client();

	}

}
