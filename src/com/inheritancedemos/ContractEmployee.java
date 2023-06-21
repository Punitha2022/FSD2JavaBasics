package com.inheritancedemos;

public class ContractEmployee extends Employee {
private int hrsWorked;
private double ratePerHour;
public ContractEmployee(int empid, String name, int age, String department, int hrsWorked, double ratePerHour) {
	super(empid, name, age, department);
	this.hrsWorked = hrsWorked;
	this.ratePerHour = ratePerHour;
}
public int getHrsWorked() {
	return hrsWorked;
}
public void setHrsWorked(int hrsWorked) {
	this.hrsWorked = hrsWorked;
}
public double getRatePerHour() {
	return ratePerHour;
}
public void setRatePerHour(double ratePerHour) {
	this.ratePerHour = ratePerHour;
}
@Override
	public double calculateSalary() {
		return this.ratePerHour * this.hrsWorked;
	}
}





