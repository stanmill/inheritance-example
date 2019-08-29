package com.collabera.decorator;

public class ToppingDecorator implements Pizza {
	
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost();
	}

}
