package com.exmple.demo;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		while(true)
		{
			Scanner s1=new Scanner(System.in);
			StudentService s2=new StudentService();

			System.out.println(" Curd Operation");
			System.out.println(" 1.set Data");
			System.out.println(" 2.Display");
			System.out.println(" Enter Your Choice");
			int x=s1.nextInt();
			switch (x) {
			case 1: {
				s2.setData();
				break;
			}
			case 2: {

				s2.display();
				break;
			}
			default:
				System.out.println("Enter Valid choice");
			}

		}


	}
}
