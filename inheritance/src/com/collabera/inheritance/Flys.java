package com.collabera.inheritance;

public interface Flys {
	
	String fly();

}

class ItFlys implements Flys {

	public String fly() {
		// TODO Auto-generated method stub
		return "I can fly";
	}
	
}

class CantFly implements Flys {

	
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly";
	}
	
}
