package com.singleton.demo;

public class TestDemo {
	public static void main(String[] args) {
		Demo d1= Demo.getData();
		Demo d2= Demo.getData();
		System.out.println(d1==d2);
	}
}
