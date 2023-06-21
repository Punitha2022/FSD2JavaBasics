package com.inheritancedemos;

public class ComparingProducts {

	public static void main(String[] args) {
		Product pd1=new Product(1,"Laptop", 50000.0);
		Product pd2=new Product(1,"Laptop",50000.0);
		Product pd3=new Product(2,"Computer",45000.0);
		Product pd4=pd1;
		Product pd5=null;
		System.out.println("pd1==pd2"+(pd1==pd2));
		System.out.println("pd1.equals(pd2)"+ pd1.equals(pd2));
		System.out.println("pd1==pd4"+(pd1==pd4));
		System.out.println("pd1.equals(pd3)"+pd1.equals(pd3));
		System.out.println(""+pd1.equals(pd5));
		System.out.println("pd1.equals(pd4)"+pd1.equals(pd4));
		System.out.println("pd1.equals(string)" + pd1.equals("Helloworld"));
	}

}
