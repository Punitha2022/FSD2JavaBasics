package com.inheritancedemos;

public class ComparingObjects {

	public static void main(String[] args) {
	  String str1="Hello World";
	  String str2="Hello World";
	  String str3=new String("Hello World");
	  String str4=str1;
	  String str5="hello world";
	  
	  //To compare momory location use == symbol
	  //to compare the content use equals method
	  
	  System.out.println("str1==str2"+ (str1==str2));
	  System.out.println("str1==str3"+ (str1==str3));
	  System.out.println("str1==str4"+ (str1==str4));
	  System.out.println("str1==str5"+ (str1==str5));
	  
	  System.out.println("str1.equals(str2)" + str1.equals(str2));
	  System.out.println("str1.equals(str3)" + str1.equals(str3));
	  System.out.println("str1.equals(str4)" + str1.equals(str4));
	  System.out.println("str1.equals(str5)" + str1.equals(str5));
	 
	  

	}

}
