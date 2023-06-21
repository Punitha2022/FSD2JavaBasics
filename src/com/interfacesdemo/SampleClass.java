package com.interfacesdemo;

public class SampleClass implements SampleInterface {

	@Override
	public void methodA() {
		System.out.println("In methodA...");
	}

	@Override
	public int methodB(int a, int b) {
		System.out.println("In method b " );
		return a+b;
	}

	@Override
	public String methodC(String... str) {
		System.out.println("In methodC");
		StringBuffer sb=new StringBuffer();
		//String - type
		//s - local variable of for loop
		//str - array of string
		//for each String s in str
		for(String s:str)//for each loop
			sb.append(s+" ");
		//1st iteration sb.append("john"+" ") => john 
		//2nd iteration sb.append("smith"+" ") => john smith
		//3rd iteration sb.append("adam"+" ")=> john smith adam
		return  sb.toString();
	}

	public void methodD() {
		System.out.println("In methodD");
	}
}
