package com.arraydemos;

import java.util.function.BiConsumer;

public class ProductOfNumbers {
	public static void main(String[] args) {
		int numbers[] = { 5, 4, 8, 3 };
		int products[] = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			int prod = 1;
			for (int j = 0; j < numbers.length; j++) {
				if (i != j)
					prod = prod * numbers[j];
			}
			products[i] = prod;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(products[i] + " ");
		}
	}
}
