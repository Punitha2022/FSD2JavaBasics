package com.demos;

public class StringDemos {
public static void main(String[] args) {
//	String str="Hello";
//	str.concat(" World");
//	String str1="Hello";
//	String str2=new String("Hello");
//	
//	if(str1==str2)
//		System.out.println("Both are referring to the same memory address");
//	else
//		System.out.println("Both are referring to different memory address");
//	
//	if(str==str1)
//	System.out.println("Both are referring to the same memory address");
//	else
//		System.out.println("Both are referring to different memory address");
//	System.out.println(str);
//	str = str.concat(" World");
//	System.out.println(str);
//
	String st1="Hello World";
	String st2=new String("Hello World");
	String st3="Hello World";
	
	System.out.println("st1==st2 " + (st1==st2));
	System.out.println("comparing Content " + st1.equals(st2));
	System.out.println("st1==st3 " + (st1==st3));
	System.out.println("st1 " + st1);
	System.out.println("st2 " + st2);
	System.out.println("st3 " + st3);
	
	String name1="john";
	String name2="John";
	System.out.println("name1==name2" + (name1==name2));
	System.out.println(name1.equalsIgnoreCase(name2));
	System.out.println(name1.charAt(0));
	
	String email="john@gmail.com";
	System.out.println(email.contains("gmail"));
	System.out.println(email.length());
  
}
}
















