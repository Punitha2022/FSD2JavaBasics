package com.demos;

import java.util.Scanner;

import com.inheritancedemos.AccessModifiersDemo;

public class Main {

	public static void main(String[] args) {
		//CREATE AN OBJECT OF TYPE STUDENT
		//1. Specify the data type
		//2. Define the reference variable
		//3. using new operator create an object
		//4. initialize
		
		//Constructing an Object of type Student
		Student stu=new Student();
		Student stu1=new Student();
	    
		stu=null;
		
		
		System.out.println("name before update " + stu.getName());
		stu.setName("John");
		System.out.println("name after update " + stu.getName());
		
		Student s=new Student("Kumar",19,"BE");
		Student.pass_mark=40;
		
		AccessModifiersDemo ad=new AccessModifiersDemo();
		
	}

}
