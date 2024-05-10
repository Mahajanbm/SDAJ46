package com.demo.example;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("CUrd Operation");
			System.out.println("1.Insert");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Fetch");
			System.out.println("Enter your Choice");
			Scanner s1=new Scanner(System.in);
			int a=s1.nextInt();
			
			switch (a) {
			case 1: {
				System.out.println("Data inserted");
				break;
			}
			case 2: {
				System.out.println("Data Updated");
				break;
			}case 3: {
				System.out.println("Data Deleted");
				break;
			}case 4: {
			//	System.out.println("Data Fetch");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Invalid input");
			}
			
			
		}




	}
}
