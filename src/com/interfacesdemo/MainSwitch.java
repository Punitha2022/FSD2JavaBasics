package com.interfacesdemo;


public class MainSwitch {

	public static void main(String[] args) {
		Switch sw1=new Fan();
		Switch sw2=new Light();
		sw1.on();
		sw1.off();
		sw2.on();
		sw2.off();
		Fan f1=(Fan)sw1;//Type casting
		f1.increaseSpeed();
		f1.decreaseSpeed();	
	}
}
