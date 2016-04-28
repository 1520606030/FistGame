package com.edu.qdu.game;

import java.util.Scanner;

public class Referee {
	private static int total;
	private static int mySelfWinning;
	private static int PlayerWinning1;
	private static int PlayerWinning2;
	private static int PlayerWinning3;
	{
		total = 0;
		mySelfWinning = 0;
		PlayerWinning1 = 0;
		PlayerWinning2 = 0;
		PlayerWinning3 = 0;
	}
	//startGame()
	public static void startGame(){
		total = 0;
		System.out.print("请选择对方角色(1:刘备;2:孙权;3:曹操):");
		Scanner input = new Scanner(System.in);
		int selectRole = input.nextInt();
		//自己
		PlayerMyself pm = new PlayerMyself();
		System.out.print("请输入你的姓名：");
		pm.inputName();		
		
		switch (selectRole) {
		//角色-刘备
		case 1:
			Player1 p1 = new Player1();
			p1.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p1.getPlayerName() + "    对战");
			
			System.out.print("\r\n你要开始吗？  (y/n)");
			String selectYN = input.next();
			String y = "y";
			String n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame1();
					total++;
					System.out.print("\r\n是否开始下一轮？  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p1.getPlayerName() + "    对战");
					System.out.println("对战次数  " + total + "\r\n");
					System.out.println("姓名\t得分");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p1.getPlayerName() + "\t" + PlayerWinning1);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("退出游戏！");
				break;
		}
		//角色-孙权
		case 2:
			Player2 p2 = new Player2();
			p2.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p2.getPlayerName() + "    对战");
			
			System.out.print("\r\n你要开始吗？  (y/n)");
			selectYN = input.next();
			y = "y";
			n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame2();
					total++;
					System.out.print("\r\n是否开始下一轮？  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p2.getPlayerName() + "    对战");
					System.out.println("对战次数  " + total + "\r\n");
					System.out.println("姓名\t得分");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p2.getPlayerName() + "\t" + PlayerWinning2);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("退出游戏！");
				break;
		}
		//角色-曹操
		case 3:
			Player3 p3 = new Player3();
			p3.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p3.getPlayerName() + "    对战");
			
			System.out.print("\r\n你要开始吗？  (y/n)");
			selectYN = input.next();
			y = "y";
			n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame3();
					total++;
					System.out.print("\r\n是否开始下一轮？  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p3.getPlayerName() + "    对战");
					System.out.println("对战次数  " + total + "\r\n");
					System.out.println("姓名\t得分");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p3.getPlayerName() + "\t" + PlayerWinning3);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("退出游戏！");
				break;
		}

		//错误角色
		default:
			break;
		}
}
	
	//playGame()
	public static void playGame1(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("请出拳：1.剪刀  2.石头  3.布 (输入相应数字)：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player1 p1 = new Player1();
		p1.inputName();
		p1.myFist();
		//玩家出拳-剪刀
		if (a == 1) {
			System.out.println("你出拳：剪刀");
			
			switch (p1.getFistKind()) {
			case 1:
				System.out.println(p1.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，平局！");
				break;
			case 2:
				System.out.println(p1.getPlayerName() + "出拳：石头\r\n结果说：^_^，你输了，真笨！");
				PlayerWinning1 ++; 
				//p1.setWinningTimes(p1.getWinningTimes()+1);
				break;
			case 3:
				System.out.println(p1.getPlayerName() + "出拳：布\r\n结果说：^_^，你赢了，真棒！");
				mySelfWinning ++;
				break;
			} 
		//玩家出拳-石头
		}else if (a == 2) {
				System.out.println("你出拳：石头");
				switch (p1.getFistKind()) {
				case 1:
					System.out.println(p1.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你赢了，真棒！");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p1.getPlayerName() + "出拳：石头\r\n结果说：^_^，平局！");
					break;
				case 3:
					System.out.println(p1.getPlayerName() + "出拳：布\r\n结果说：^_^，你输了，真笨！");
					PlayerWinning1 ++;
					break;
				}
		//玩家出拳-布
		}else if (a == 3) {
					System.out.println("你出拳：布");
					switch (p1.getFistKind()) {
					case 1:
						System.out.println(p1.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你输了，真笨！");
						PlayerWinning1 ++;
						break;
					case 2:
						System.out.println(p1.getPlayerName() + "出拳：石头\r\n结果说：^_^，你赢了，真棒！");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p1.getPlayerName() + "出拳：布\r\n结果说：^_^，平局！");
						break;
					}
		}
	}
	public static void playGame2(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("请出拳：1.剪刀  2.石头  3.布 (输入相应数字)：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player2 p2 = new Player2();
		p2.inputName();
		p2.myFist();
		//玩家出拳-剪刀
		if (a == 1) {
			System.out.println("你出拳：剪刀");
			
			switch (p2.getFistKind()) {
			case 1:
				System.out.println(p2.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，平局！");
				break;
			case 2:
				System.out.println(p2.getPlayerName() + "出拳：石头\r\n结果说：^_^，你输了，真笨！");
				PlayerWinning2 ++; 
				//p1.setWinningTimes(p1.getWinningTimes()+1);
				break;
			case 3:
				System.out.println(p2.getPlayerName() + "出拳：布\r\n结果说：^_^，你赢了，真棒！");
				mySelfWinning ++;
				break;
			} 
		//玩家出拳-石头
		}else if (a == 2) {
				System.out.println("你出拳：石头");
				switch (p2.getFistKind()) {
				case 1:
					System.out.println(p2.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你赢了，真棒！");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p2.getPlayerName() + "出拳：石头\r\n结果说：^_^，平局！");
					break;
				case 3:
					System.out.println(p2.getPlayerName() + "出拳：布\r\n结果说：^_^，你输了，真笨！");
					PlayerWinning2 ++;
					break;
				}
		//玩家出拳-布
		}else if (a == 3) {
					System.out.println("你出拳：布");
					switch (p2.getFistKind()) {
					case 1:
						System.out.println(p2.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你输了，真笨！");
						PlayerWinning2 ++;
						break;
					case 2:
						System.out.println(p2.getPlayerName() + "出拳：石头\r\n结果说：^_^，你赢了，真棒！");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p2.getPlayerName() + "出拳：布\r\n结果说：^_^，平局！");
						break;
					}
		}
	}
	public static void playGame3(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("请出拳：1.剪刀  2.石头  3.布 (输入相应数字)：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player3 p3 = new Player3();
		p3.inputName();
		p3.myFist();
		//玩家出拳-剪刀
		if (a == 1) {
			System.out.println("你出拳：剪刀");
			
			switch (p3.getFistKind()) {
			case 1:
				System.out.println(p3.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，平局！");
				break;
			case 2:
				System.out.println(p3.getPlayerName() + "出拳：石头\r\n结果说：^_^，你输了，真笨！");
				PlayerWinning3 ++; 
				break;
			case 3:
				System.out.println(p3.getPlayerName() + "出拳：布\r\n结果说：^_^，你赢了，真棒！");
				mySelfWinning ++;
				break;
			} 
		//玩家出拳-石头
		}else if (a == 2) {
				System.out.println("你出拳：石头");
				switch (p3.getFistKind()) {
				case 1:
					System.out.println(p3.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你赢了，真棒！");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p3.getPlayerName() + "出拳：石头\r\n结果说：^_^，平局！");
					break;
				case 3:
					System.out.println(p3.getPlayerName() + "出拳：布\r\n结果说：^_^，你输了，真笨！");
					PlayerWinning3 ++;
					break;
				}
		//玩家出拳-布
		}else if (a == 3) {
					System.out.println("你出拳：布");
					switch (p3.getFistKind()) {
					case 1:
						System.out.println(p3.getPlayerName() + "出拳：剪刀\r\n结果说：^_^，你输了，真笨！");
						PlayerWinning3 ++;
						break;
					case 2:
						System.out.println(p3.getPlayerName() + "出拳：石头\r\n结果说：^_^，你赢了，真棒！");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p3.getPlayerName() + "出拳：布\r\n结果说：^_^，平局！");
						break;
					}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*****************");
		System.out.println("***** 猜拳,开始  ****");
		System.out.println("*****************");
		startGame();
	}
}
