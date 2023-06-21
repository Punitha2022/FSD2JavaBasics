package com.interfacesdemo;

public class Fan implements Switch {

	@Override
	public void on() {
      System.out.println("Fan is switched on...");

	}

	@Override
	public void off() {
		System.out.println("Fan is switched off....");

	}

	void increaseSpeed() {
		System.out.println("Fan speed is increased....");
	}
	
	void decreaseSpeed() {
		System.out.println("Fan speed is decreased...");
	}
}
