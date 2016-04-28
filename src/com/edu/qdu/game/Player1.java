package com.edu.qdu.game;

public class Player1 extends Player{

	@Override
	public void inputName() {
		setPlayerName("Αυ±Έ");
	}

	@Override
	public void myFist() {
		setFistKind((int)(Math.random()*3) + 1);
	}
	
	
}
