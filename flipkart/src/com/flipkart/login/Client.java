package com.flipkart.login;

public class Client {
	int id=101; 
	static String name="Mahi";
	void demo()
	{
		System.out.println(id);
		System.out.println(Client.name);
	}
	static void data()
	{
		Client c1=new Client();
		//	System.out.println(c1.id);
		//System.out.println(Client.name);
		System.out.println("value of c1 in data method:  "+c1.hashCode());
	}
	public static void main(String[] args) {
		Client c1=new Client();
		//System.out.println(c1.id);
		//System.out.println(Client.name);
		//c1.demo();
		Client.data();
		System.out.println("value of c1 in main method:  "+c1.hashCode());

	}
}
