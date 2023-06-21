package com.inheritancedemos;

public abstract class Employee  {
private int empid;
private String name;
private int age;
private String department;
public Employee(int empid, String name, int age, String department) {
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.department = department;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

public final void displaySalary() {
	System.out.println("-".repeat(20));
	System.out.printf("Salary %.3f \n",calculateSalary());
	System.out.println("-".repeat(20));
}

public abstract double calculateSalary();

}









