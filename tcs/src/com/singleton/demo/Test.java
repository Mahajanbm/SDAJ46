package com.singleton.demo;

public class Test {
	public static void main(String[] args) {
		//	Singleton s1=new Singleton();

		//Singleton s2=new Singleton();

		//	Singleton s3=new Singleton();
		Singleton s1=Singleton.data();//13564
		Singleton s2=Singleton.data();//12345
		System.out.println(s1==s2);

	}

}
