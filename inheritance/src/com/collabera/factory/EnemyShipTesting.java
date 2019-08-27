package com.collabera.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;

		Scanner kb = new Scanner(System.in);
		
		System.out.println("What type of ship ? (U / R / B)");
		
		if(kb.hasNextLine()) {
			String typeOfShip = kb.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if(theEnemy != null) doStuffEnemy(theEnemy);
		else System.out.println("Enter the right letter");
	}

	public static void doStuffEnemy(EnemyShip anEnemyship) {
		// TODO Auto-generated method stub
		anEnemyship.displayEnemyShip();
		anEnemyship.followHeroShip();
		anEnemyship.enemyShipShoots();
		
	}

}
