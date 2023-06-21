package com.interfacesdemo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		SampleClass sc=new SampleClass();
		SampleInterface si=new SampleClass();
		
		
		System.out.println("BONUS " + SampleInterface.BONUS);
		System.out.println("PI " + SampleInterface.PI);
		
		System.out.println("BONUS " + sc.BONUS);
		System.out.println("PI " + sc.PI);
		
		sc.methodA();
		int c=sc.methodB(12, 23);
		System.out.println(c);
		String values=sc.methodC("john","smith","adam");
		System.out.println(values);
		sc.methodD();
	}
	
	
	
	

}
