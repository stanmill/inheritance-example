package com.collabera.inheritance;

public class Giraffe extends Creature{
	
	private String name;
	private double height;
	private double weight;
	private String favFood;
	private double speed;
	private String sound;

	@Override
	public void setName(String newName) {
		name = newName;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setHeight(double newHeight) {
		// TODO Auto-generated method stub
		height = newHeight;
		
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public void setWeight(double newWeight) {
		// TODO Auto-generated method stub
		weight = newWeight;
		
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setFavFood(String newFood) {
		// TODO Auto-generated method stub
		favFood = newFood;
		
	}

	@Override
	public String getFavFood() {
		// TODO Auto-generated method stub
		return favFood;
	}

	@Override
	public void setSpeed(double newSpeed) {
		// TODO Auto-generated method stub
		speed = newSpeed;
		
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void setSound(String newSound) {
		// TODO Auto-generated method stub
		sound = newSound;
		
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return sound;
	}

}
