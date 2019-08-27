package com.collabera.factory;

public abstract class EnemyShip {
	
	private String name;
	private double atmDamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAtmDamage() {
		return atmDamage;
	}
	public void setAtmDamage(double atmDamage) {
		this.atmDamage = atmDamage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is fon the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getAtmDamage());
	}

}
