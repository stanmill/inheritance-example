package com.collabera.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin dough";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of dough:" + 4.00);
		return 4.00;
	}

}
