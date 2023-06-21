package com.inheritancedemos;

public class PermanentEmployee extends Employee{
private double basicSalary;
private double hra;
public PermanentEmployee(int empid, String name, int age, String department, 
		double basicSalary, double hra) {
	super(empid, name, age, department);
	this.basicSalary = basicSalary;
	this.hra = hra;
}
public double getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}

//@Override
//	public void displaySalary() {
//		System.out.println("..........");
//		System.out.println(calculateSalary());
//	}

@Override
	public double calculateSalary() {
		return this.basicSalary + this.hra;
	}
}
