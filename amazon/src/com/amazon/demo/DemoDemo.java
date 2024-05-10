package com.amazon.demo;

import java.util.Scanner;

public class DemoDemo {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);//taking input from user
		System.out.println("Enter Data");
		int a=s1.nextInt();
		
		if(a>=10) {
			System.out.println("VAlue a is greater ");
		}
		System.out.println("VAlue of Data is: "+a);
	}
}
