package com.oops.demo;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Student s2=new Student();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=s1.nextInt();
		s2.getData(id, "Mahi", "Hyd", 60, "Ts", "INDIA", "9966332255");
		s2.display();

	}
}
