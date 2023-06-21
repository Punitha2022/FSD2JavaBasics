package com.collectionsdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetOfUsers {
public static void main(String[] args) {
	
	Comparator<User> EMAIL_COMPARATOR=new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.getEmail().compareTo(o2.getEmail());
		}
	};
	Comparator<User> PHONE_COMPARATOR=new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return Long.compare(o1.getPhonenumber(), o2.getPhonenumber());
		}
	};
	
	
	Set<User> usrs=new TreeSet<User>(PHONE_COMPARATOR);
	usrs.add(new User("Akila","akil@gmail.com",9389889888L));
	usrs.add(new User("Mohan","mohan@gmail.com",9493929299L));
	usrs.add(new User("Smitha","smitha@gmail.com",9483849389L));
	usrs.add(new User("hema","hema.s@gmail.com",940930949L));
	usrs.add(new User("Akila","akil@gmail.com",9389889888L));
	usrs.add(new User("Mohan","mohan@gmail.com",9493929299L));

	Iterator<User> iterator=usrs.iterator();
	while(iterator.hasNext())
	{
		User user=iterator.next();
		System.out.println(user);
	}
}
}
