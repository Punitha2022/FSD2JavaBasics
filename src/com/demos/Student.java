package com.demos;

public class Student {
  private String name;
  private int age;
  private String qualification;
  public static  int pass_mark=35;
  //Default constructor
public Student(){
	  
}
public Student(String name, int age, String qualification) {
	this.name = name;
	this.age = age;
	this.qualification = qualification;
}


public static void staticMethod() {
	
}
//setters - mutators - to modify the data
public void setName(String name) {
	this.name=name;
}

public void setAge(int age) {
	this.age=age;
}

public void setQualification(String qualification) {
	this.qualification=qualification;
}
  //getters - accessors
public String getName() {
	return this.name;
}

public int getAge() {
	return this.age;
}

public String getQualification() {
	return this.qualification;
}
}
