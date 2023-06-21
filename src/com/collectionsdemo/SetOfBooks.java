package com.collectionsdemo;
import java.util.HashSet;
import java.util.Set;

public class SetOfBooks {
public static void main(String[] args) {
	Set<Book> books=new HashSet<Book>();
	books.add(new Book("Java Complete reference",2000.0));
	books.add(new Book("Head first java",1500.00));
	books.add(new Book("Java Complete reference",2000.0));
	System.out.println(books);
	
}
}
