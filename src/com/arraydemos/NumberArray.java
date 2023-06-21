package com.arraydemos;

public class NumberArray {

	public static void main(String[] args) {
		int numbers[]=new int[10];
		int values[]= {5,10,15,20,25};
		
		String names[]=new String[5];
		String names1[]= {"James","John","smith"};
		
		
		for(int i=0;i<10;i++) {
			numbers[i]=i*2;
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
	
	}

}
