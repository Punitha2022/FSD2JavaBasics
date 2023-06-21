package com.interfacesdemo;

public class TV implements Remote {
	@Override
	public void on() {
		System.out.println("Tv is switched on..");
	}
	@Override
	public void off() {
		System.out.println("Tv is switched off..");
	}
	@Override
	public void increaseVolume() {
		System.out.println("Tv volume is increased..");

	}
	@Override
	public void decreaseVolume() {
		System.out.println("Tv volume is decreased..");

	}
	@Override
	public void pause() {
		System.out.println("Pause...");
	}
	@Override
	public void play() {
		System.out.println("Play..");
	}

	
}
