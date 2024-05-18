package com.interfacedemo.demo;

public  abstract class Employee extends Person {

	private float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public abstract void display();
}
