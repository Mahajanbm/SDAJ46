package com.inheritance.demo;

import java.util.Scanner;
import java.util.concurrent.FutureTask;



public class Test {
	public static void main(String[] args) {
		while(true)
		{
			Scanner s1=new Scanner(System.in);
			EmployeeFullTimeService f1=new EmployeeFullTimeService();
			EmployeePartTimeService p1=new EmployeePartTimeService();
			OwnerService o1=new OwnerService();
			System.out.println(" Org Data");
			System.out.println(" 1.setFullTimeData");
			System.out.println(" 2.getFullTimeData");
			System.out.println(" 3.setPartTimeData");
			System.out.println(" 4.getPartTimeData");
			System.out.println(" 5.setOwnerData");
			System.out.println(" 6.getOwnerData");
			System.out.println(" Enter Your Choice");
			int x=s1.nextInt();
			switch (x) {
			case 1: {
				f1.setFullTimeEmployee();

				break;
			}
			case 2: {
				f1.getFullTimeEmployee();

				break;
			}
			case 3: {
				p1.setPartTimeEmployee();
				break;
			}
			case 4: {
				p1.getPartTimeEmployee();

				break;
			}
			case 5: {

				o1.setPartTimeEmployee();
				break;
			}
			case 6: {
				o1.getFullTimeEmployee();


				break;
			}
			default:
				System.out.println("Enter Valid choice");
			}

		}
	}

}
