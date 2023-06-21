package com.arraydemos;

import java.util.Scanner;

public class SumAndAverage {
public static void main(String[] args) {
	int numbers[]=new int[10];
	
	Scanner scanner=new Scanner(System.in);
	for(int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i] + " ");
	}
	System.out.println();
	for(int i=0;i<numbers.length;i++) {
		System.out.println("Enter the number ");
		numbers[i]=scanner.nextInt();
	}
	 int sum=0;
	
	for(int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i] + " , ");
		sum=sum+numbers[i];
	}
	System.out.println();
	System.out.println("Sum = " + sum);
    
	double avg=(double)sum/(double)numbers.length;//type casting (double)sum
	System.out.println("Average " + avg);
}
}






