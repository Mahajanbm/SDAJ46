package com.curd.test;

import java.util.Scanner;

import com.curd.operation.Search;

public class CurdTest {
	public static void main(String[] args) {

		while(true)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("**CURD OPERATION**");
			System.out.println("1.Save Data");
			System.out.println("2.Update Data");
			System.out.println("3.Delete Data");
			System.out.println("4.Display Data");
			System.out.println("5.Serach Data");
			System.out.println("Entere Your Choice");

			int x=s1.nextInt();


			switch (x) {
			case 1: {
				System.out.println("Data Save");
				break;
			}
			case 2: {
				System.out.println("Data Updated");
				break;
			}
			case 3: {

				System.out.println("Data Deleted");
				break;
			}
			case 4: {

				System.out.println("Data Display");
				break;
			}
			case 5: {
				//	Search s2=new Search();
				//	s2.search();
				System.out.println("under maintance");
				//	System.out.println("Data Search");
				//break;
			}


			default:
				System.out.println("Wrong Choice");
			}





		}
	}
}
