package com.arraydemos;

public class MultidimensionalArray {
public static void main(String[] args) {
	int multiArray[][]=new int[3][3];
	int numbers[][]= {{1,2},{3,4,5},{1,5}};
	int value = 1;
	for(int i=0;i<3;i++)
		for(int j=0;j<3;j++)
		{
			multiArray[i][j]=value;
			value++;
		}
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(numbers[i][j]+" ");
		}
		System.out.println();
	}
}
}
