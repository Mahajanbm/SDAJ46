package com.tcs.login;

public class Test {
	static int id;
	String name;
	String city;
	float salary; 
	void getData()
	{ 
		System.out.println(Test.id);
		System.out.println(name);
		System.out.println(city );
		System.out.println(salary);
	}


	static  void display()
	{  
		int id=50;
		Test t1=new Test();
		System.out.println(Test.id);
		System.out.println(t1.name);
		System.out.println(t1.city );
		System.out.println(t1.salary);

	}
}
