package com.demos;

public class Clock {
	private int hours;
	private int mins;
	private int secs;

	public Clock(int hours, int mins, int secs) {
		if(hours>=0 && hours<24)
		this.hours = hours;
		else
			this.hours=0;
		if(mins>=0 && mins<60)
		this.mins = mins;
		else
			this.mins=0;
		if(secs>=0 && secs<60 )
		this.secs = secs;
		else this.secs=0;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if(hours>=0 && hours<24)
		this.hours = hours;
		else
			this.hours=0;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		if(mins>=0 && mins<60)
		this.mins = mins;
		else
			this.mins=0;
	}

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		if(secs>=0 && secs<60)
		this.secs = secs;
	}
	
	
	public void display() {
		System.out.printf("%02d:%02d:%02d\n",this.hours,this.mins,this.secs);
	}
	
	@Override
	public String toString() {
		return this.hours + ":" + this.mins + ":" + this.secs;
	}
	
	
	
	
	
	
	
	
	
    public void clockTick() {
    	this.secs++;
    	if(secs==60) {
    		mins++;
    		secs=0;
    	}
    	if(mins==60) {
    		hours++;
    		mins=0;
    		secs=0;
    	}
    	if(hours==24)
    	{
    		hours=0;
    		mins=0;
    		secs=0;
    	}
    	System.out.println(this.hours+":"+this.mins+":"+this.secs);
    }
}
