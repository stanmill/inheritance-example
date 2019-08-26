package com.collabera.inheritance;

public class Animal {
	
	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		
		if(weight >0)
		this.weight = weight;
		
		else System.out.println("Weight has to be bigger than 0");
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	private void bePrivate() {
		System.out.println("I'm the private method");
	}

}
