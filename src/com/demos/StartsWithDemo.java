package com.demos;

import java.util.Arrays;

public class StartsWithDemo {

	public static String[] collect(String names[],String prefix) {
		String anArray[]=new String[names.length];
		int j=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].toLowerCase().startsWith(prefix.toLowerCase())) {
				anArray[j]=names[i];
				j++;
			}
		}
		return anArray;
	}
	public static void main(String[] args) {
		String names[]= {"James","John","adam","Joe","Anil","Clara","Jim"};
		String anArray[]=collect(names,"A");
		System.out.println( Arrays.toString(anArray));

	}

}
