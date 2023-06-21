package com.demos;

public class ReversingAString {
	//Hello World
	//012345678910
public static String reverse(String str) {
	//StringBuffer is mutable
	//StringBuffer is Thread Safe
	
	//StringBuilder is mutable
	//StringBuilder is not Thread Safe
	
	//String is immutable
	StringBuffer sb=new StringBuffer();
	for(int i=str.length()-1;i>=0;i--) {
		sb.append(str.charAt(i));//d,d1,dlr,dlro,dlroW,dlroW ,dlroW o,
	}
	return sb.toString();
}
public static void main(String[] args) {
	System.out.println(reverse("Hello World"));
}
}
