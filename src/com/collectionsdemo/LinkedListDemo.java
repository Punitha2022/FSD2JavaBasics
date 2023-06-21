package com.collectionsdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {//value is data
	public static List<Integer> remove(List<Integer> list, Integer value){
		list.remove(value);
		return list;
	}
	public static List<Integer> remove(List<Integer> list, int index) {
		list.remove(index);
		return list;
	}
	public static List<Integer> addNumber(List<Integer> list, int index, int value) {
		if (index > list.size()) {
			System.out.println("Index value is greater than size of a list");
			return list;
		} else {
			list.add(index, value);
			return list;
		}
	}

	public static List<Integer> addNumber(List<Integer> list, int value) {
		list.add(value);
		return list;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<Integer>();
		addNumber(numbers, 10);// 10
		addNumber(numbers, 20);// 20
		addNumber(numbers, 1, 45); // adding number in a particular index
		addNumber(numbers, 0, 12);
		addNumber(numbers, 2, 11);
		System.out.println("The size of the list is " + numbers.size());
		addNumber(numbers, 10, 25);
		System.out.println(numbers);
		System.out.println("Removing an element at the index 0");
		remove(numbers,0);//0 primitive type
		System.out.println("After removal");
		System.out.println(numbers);
		System.out.println("Removing an element 45");
		remove(numbers,(Integer)45);//45 wrapper (object) type
		System.out.println("After removing 45");
		System.out.println(numbers);
	}
}
