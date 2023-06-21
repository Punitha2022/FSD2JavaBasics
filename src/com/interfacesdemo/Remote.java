package com.interfacesdemo;

public interface Remote extends Switch {
void increaseVolume();
void decreaseVolume();
void pause();
void play();
default public void defaultMethod() {
	System.out.println("This is the default method in remote interface");
}

static public void staticMethod() {
	System.out.println("This is the static method in the interface..");
}
}
