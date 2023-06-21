package com.demos;

public class ArrayOfObjects {
public static void main(String[] args) {
	Clock clocks[]=new Clock[3];
	System.out.println(clocks[0]);
	System.out.println(clocks[1]);
	System.out.println(clocks[2]);
	
	
	clocks[0]=new Clock(10,10,10);
	clocks[1]=new Clock(12,12,12);
	clocks[2]=new Clock(14,14,14);
	
	for(int i=0;i<=clocks.length;i++)
		clocks[i].display();
	
}
}
