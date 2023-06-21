package com.demos;

public class CreatingObjects {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student("James",20,"BE");
	Student s3=new Student();
	Student s4=new Student("John",19,"Bsc");
	Student s5=new Student("John",19,"Bsc");
	Student s6=s5;
}
}
