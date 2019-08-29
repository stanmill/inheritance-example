package com.collabera.decorator;

public class TomatoSauce extends ToppingDecorator {
	
	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding Sauce");

	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", tomato sauce";
	}
	
	public double getcost() {
		System.out.println("Cost of Sauce: " + .35);
		return tempPizza.getCost() + .35;
	}

}
