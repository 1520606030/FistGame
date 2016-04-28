package com.edu.qdu.game;

import java.util.Scanner;

public class PlayerMyself extends Player{

	@Override
	public void inputName() {
		Scanner input = new Scanner(System.in);
		setPlayerName(input.next());
	}

	@Override
	public void myFist() {
		
	}

}
