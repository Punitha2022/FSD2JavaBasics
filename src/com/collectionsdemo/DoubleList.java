package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoubleList {
public static void main(String[] args) {
	List<Double> doubleList=new ArrayList<Double>();
	doubleList.add(12.4);
	doubleList.add(20.5);
	doubleList.add(10.3);
	doubleList.add(12.4);
	doubleList.add(20.5);
	doubleList.add(10.3);
	System.out.println("Double List");
	System.out.println(doubleList);
	
	Collections.sort(doubleList);
	System.out.println(doubleList);
	
    List<String> names=new ArrayList<String>();
    names.add("James");
    names.add("Akila");
    names.add("Bavani");
    names.add("Nirmal");
    Collections.sort(names);    
}
}
