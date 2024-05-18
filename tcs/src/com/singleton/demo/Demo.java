package com.singleton.demo;

public class Demo {

	private static Demo d1=null;//
	private Demo()
	{

	}
	static Demo getData()
	{
		if(d1==null)
		{
			d1=new Demo();//lazy 
		}
		return d1;

	}


}
