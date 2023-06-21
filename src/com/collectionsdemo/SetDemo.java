package com.collectionsdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	Set<Integer> setOfIntegers=new HashSet<Integer>();
	System.out.println(setOfIntegers.add(1));
	System.out.println(setOfIntegers.add(2));
	System.out.println(setOfIntegers.add(1));
	System.out.println(setOfIntegers);
	
	Set<String> setOfString=new TreeSet<String>();
	setOfString.add("James");
	setOfString.add("Adam");
	setOfString.add("Smith");
	setOfString.add("John");
	setOfString.add("Clara");
	setOfString.add("Joe");
	setOfString.add("James");
	System.out.println(setOfString);
	
	
}
}
