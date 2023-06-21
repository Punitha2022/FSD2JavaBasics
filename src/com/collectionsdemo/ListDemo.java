package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
	  List<Integer> list1=new ArrayList<Integer>();
      list1.add(1);//new Integer(1) 
      //boxing - converting primitive type to an object
      //new Integer(1)
      list1.add(2);
      list1.add(3);
      //Traditional For loop
      for(int i=0;i<list1.size();i++)
    	  System.out.println(list1.get(i));
      //For each loop
      //for(Type locVar: collectionVar)
      for(Integer i:list1)
    	  System.out.println(i);
      //hasNext return boolean.. will return true if element exists
      //else false
      //next() - it will return next object
      //list1= [1,2,3]
      for (Iterator<Integer> iterator = list1.iterator(); iterator.hasNext();) {
		Integer integer = iterator.next();
		System.out.println(integer);
	}
      
	}

}
