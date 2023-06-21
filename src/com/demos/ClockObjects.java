package com.demos;

public class ClockObjects {

	public static void main(String[] args) {
		Clock c1=new Clock(2,10,5);
		
		
		c1.display();
		System.out.println(c1);
		
		
		Clock c2=new Clock(11,10,20);
		c2.display();
		c2.setHours(12);
		c2.display();
		System.out.println(c2);
		
	}

}
