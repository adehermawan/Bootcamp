package com.mitrais.app;

public class Salary extends Employee{
	private double salary;

	public Salary(String name, String address, int number) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		
	}
	
	public void mailCheck() {
		System.out.println("Within mailcheck of Salary class ");
		System.out.println("Mailing check to "+getName()+" with salary "+ salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing salary pay for "+ getName());
		return salary/52;
	}

}