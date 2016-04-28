package com.edu.qdu.game;

public abstract class Player {
	private String playerName;
	private int fistKind;
	private int winningTimes;
	{
		playerName = null;
		fistKind = 0;
		winningTimes = 0;
	}
	public abstract void inputName();
	
	public abstract void myFist();
	///////////////////////////////////

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getFistKind() {
		return fistKind;
	}

	public void setFistKind(int fistKind) {
		this.fistKind = fistKind;
	}

	public int getWinningTimes() {
		return winningTimes;
	}

	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}

//	public int getLoseTime() {
//		return loseTime;
//	}
//
//	public void setLoseTime(int loseTime) {
//		this.loseTime = loseTime;
//	}
	
}
