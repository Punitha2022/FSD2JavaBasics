package com.inheritancedemos;

public class Manager extends Employee {
private double rating;
private static final double bonus=5000.0;
private double basicSalary;
	public Manager(int empid, String name, int age, String department,
			double rating,  double basicSalary) {
	super(empid, name, age, department);
	if(rating>=1 && rating<=5)
	this.rating = rating;
	else
		this.rating=1;
	
	this.basicSalary = basicSalary;
}
	@Override
	public double calculateSalary() {
		return bonus*this.rating + this.basicSalary;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getBonus() {
		return bonus;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
