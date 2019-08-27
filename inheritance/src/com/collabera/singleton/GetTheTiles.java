package com.collabera.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID "+ System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1: " + playerOneTiles);

		
	}

}
