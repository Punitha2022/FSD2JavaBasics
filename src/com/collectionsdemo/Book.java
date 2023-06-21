package com.collectionsdemo;

import java.util.Objects;

public class Book {
private String title;
private double price;
private String author;
public Book(String title, double price) {
	super();
	this.title = title;
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [title=" + title + ", price=" + price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(price, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && Objects.equals(title, other.title);
}

}
