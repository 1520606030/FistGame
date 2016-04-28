package com.edu.qdu.game;

import java.util.Scanner;

public class Player3 extends Player{

	@Override
	public void inputName() {
		setPlayerName("²Ü²Ù");
	}

	@Override
	public void myFist() {
		setFistKind((int)(Math.random()*3) + 1);
	}
	
}
