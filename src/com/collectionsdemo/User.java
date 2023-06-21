package com.collectionsdemo;

import java.util.Objects;

public class User implements Comparable<User>{
private String name;
private String email;
private long phonenumber;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public User(String name, String email, long phonenumber) {
	super();
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
}

@Override
public int hashCode() {
	return Objects.hash(email, name, phonenumber);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return Objects.equals(email, other.email) && Objects.equals(name, other.name) && phonenumber == other.phonenumber;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + "]";
}
@Override
public int compareTo(User user) {
  return this.name.compareToIgnoreCase(user.getName());
       //"Mohan".compareTo("Akila")  +Ve 'M' - 'A'  >0
       //"Akila".compareTo("Mohan")  -v  'A' - 'M'  <0
       //"Akila".compareTo("Akila")  =0  both are same
}

}
