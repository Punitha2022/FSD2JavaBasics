package com.interfacesdemo;

public class Light implements Switch {

	@Override
	public void on() {
		System.out.println("Light is switched on...");
	}

	@Override
	public void off() {
		System.out.println("Light is switched off...");

	}

}
