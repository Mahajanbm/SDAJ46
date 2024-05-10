package com.demo.example;

public class DemoD {
	public static void main(String[] args) {
		String str="pune";
		//char[] c=str.toCharArray();
		int count=0;
		for(char x:str.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}
}
