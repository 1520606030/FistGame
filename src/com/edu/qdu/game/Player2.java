package com.edu.qdu.game;

public class Player2 extends Player{

	@Override
	public void inputName() {
		setPlayerName("��Ȩ");
	}

	@Override
	public void myFist() {
		setFistKind((int)(Math.random()*3) + 1);
	}
	
}
