package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfUsers {

	public static void main(String[] args) {
		List<User> usrs=new ArrayList<User>();
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
		
		//FOR EACH LOOP
		for(User u:usrs) {
			System.out.println(u);
		}
		
	}

}
