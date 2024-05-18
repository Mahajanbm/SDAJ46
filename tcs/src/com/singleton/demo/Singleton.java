package com.singleton.demo;

public class Singleton {

	static	Singleton s1=new Singleton();//122//Eager  initialization of object
	private Singleton()
	{

	}
	static Singleton data()
	{
		 
		return s1;
	}
}
