package com.arraydemos;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMinAndMax {
public static void main(String[] args) {
	System.out.println("Enter size of an Array ");
	Scanner scanner=new Scanner(System.in);
	int size=scanner.nextInt();	
	int values[]=new int[size];
	for(int i=0;i<size;i++) {
		System.out.println("Enter the number ");
		values[i]=scanner.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.print(values[i]+" ");
	}
	Arrays.sort(values);
	System.out.println("");
	for(int i=0;i<size;i++) {
		System.out.print(values[i] + " ");
	}
	System.out.println("Minimum values is " + values[0]);
	System.out.println("Maximum values is " +values[size-1]);
}
}




