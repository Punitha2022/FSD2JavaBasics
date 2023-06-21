package com.arraydemos;

import java.util.Scanner;

public class SearchingAnElement {
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
	System.out.println("Enter the element you are searching for");
	int searchElement=scanner.nextInt();
	boolean found=false;
	//10 23 11 15 67
	//searchElement = 45
    for( int i=0;i<values.length;i++) {
    	if(searchElement==values[i]) {//45==10 45==23 45==11 45==15 45==67
    		found=true;
    		break;
    	}		
    }
	if(found)
		System.out.println(searchElement + " is found");
	else
		System.out.println(searchElement + " is not found");
}
}




