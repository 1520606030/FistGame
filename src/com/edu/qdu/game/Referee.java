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
		System.out.print("��ѡ��Է���ɫ(1:����;2:��Ȩ;3:�ܲ�):");
		Scanner input = new Scanner(System.in);
		int selectRole = input.nextInt();
		//�Լ�
		PlayerMyself pm = new PlayerMyself();
		System.out.print("���������������");
		pm.inputName();		
		
		switch (selectRole) {
		//��ɫ-����
		case 1:
			Player1 p1 = new Player1();
			p1.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p1.getPlayerName() + "    ��ս");
			
			System.out.print("\r\n��Ҫ��ʼ��  (y/n)");
			String selectYN = input.next();
			String y = "y";
			String n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame1();
					total++;
					System.out.print("\r\n�Ƿ�ʼ��һ�֣�  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p1.getPlayerName() + "    ��ս");
					System.out.println("��ս����  " + total + "\r\n");
					System.out.println("����\t�÷�");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p1.getPlayerName() + "\t" + PlayerWinning1);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("�˳���Ϸ��");
				break;
		}
		//��ɫ-��Ȩ
		case 2:
			Player2 p2 = new Player2();
			p2.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p2.getPlayerName() + "    ��ս");
			
			System.out.print("\r\n��Ҫ��ʼ��  (y/n)");
			selectYN = input.next();
			y = "y";
			n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame2();
					total++;
					System.out.print("\r\n�Ƿ�ʼ��һ�֣�  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p2.getPlayerName() + "    ��ս");
					System.out.println("��ս����  " + total + "\r\n");
					System.out.println("����\t�÷�");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p2.getPlayerName() + "\t" + PlayerWinning2);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("�˳���Ϸ��");
				break;
		}
		//��ɫ-�ܲ�
		case 3:
			Player3 p3 = new Player3();
			p3.inputName();
			System.out.println(pm.getPlayerName()+ "   VS  " + p3.getPlayerName() + "    ��ս");
			
			System.out.print("\r\n��Ҫ��ʼ��  (y/n)");
			selectYN = input.next();
			y = "y";
			n = "n";
			if (y.equalsIgnoreCase(selectYN)) {
				do{
					playGame3();
					total++;
					System.out.print("\r\n�Ƿ�ʼ��һ�֣�  (y/n)");
					selectYN = input.next();
				}while(y.equalsIgnoreCase(selectYN));
				
				if(n.equalsIgnoreCase(selectYN)){
					System.out.println("--------------------------");
					System.out.println(pm.getPlayerName()+ "   VS  " + p3.getPlayerName() + "    ��ս");
					System.out.println("��ս����  " + total + "\r\n");
					System.out.println("����\t�÷�");
					System.out.println(pm.getPlayerName() + "\t" + mySelfWinning);
					System.out.println(p3.getPlayerName() + "\t" + PlayerWinning3);
					break;
				}			
			}else if(n.equalsIgnoreCase(selectYN)){
				System.out.println("�˳���Ϸ��");
				break;
		}

		//�����ɫ
		default:
			break;
		}
}
	
	//playGame()
	public static void playGame1(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("���ȭ��1.����  2.ʯͷ  3.�� (������Ӧ����)��");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player1 p1 = new Player1();
		p1.inputName();
		p1.myFist();
		//��ҳ�ȭ-����
		if (a == 1) {
			System.out.println("���ȭ������");
			
			switch (p1.getFistKind()) {
			case 1:
				System.out.println(p1.getPlayerName() + "��ȭ������\r\n���˵��^_^��ƽ�֣�");
				break;
			case 2:
				System.out.println(p1.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^�������ˣ��汿��");
				PlayerWinning1 ++; 
				//p1.setWinningTimes(p1.getWinningTimes()+1);
				break;
			case 3:
				System.out.println(p1.getPlayerName() + "��ȭ����\r\n���˵��^_^����Ӯ�ˣ������");
				mySelfWinning ++;
				break;
			} 
		//��ҳ�ȭ-ʯͷ
		}else if (a == 2) {
				System.out.println("���ȭ��ʯͷ");
				switch (p1.getFistKind()) {
				case 1:
					System.out.println(p1.getPlayerName() + "��ȭ������\r\n���˵��^_^����Ӯ�ˣ������");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p1.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^��ƽ�֣�");
					break;
				case 3:
					System.out.println(p1.getPlayerName() + "��ȭ����\r\n���˵��^_^�������ˣ��汿��");
					PlayerWinning1 ++;
					break;
				}
		//��ҳ�ȭ-��
		}else if (a == 3) {
					System.out.println("���ȭ����");
					switch (p1.getFistKind()) {
					case 1:
						System.out.println(p1.getPlayerName() + "��ȭ������\r\n���˵��^_^�������ˣ��汿��");
						PlayerWinning1 ++;
						break;
					case 2:
						System.out.println(p1.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^����Ӯ�ˣ������");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p1.getPlayerName() + "��ȭ����\r\n���˵��^_^��ƽ�֣�");
						break;
					}
		}
	}
	public static void playGame2(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("���ȭ��1.����  2.ʯͷ  3.�� (������Ӧ����)��");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player2 p2 = new Player2();
		p2.inputName();
		p2.myFist();
		//��ҳ�ȭ-����
		if (a == 1) {
			System.out.println("���ȭ������");
			
			switch (p2.getFistKind()) {
			case 1:
				System.out.println(p2.getPlayerName() + "��ȭ������\r\n���˵��^_^��ƽ�֣�");
				break;
			case 2:
				System.out.println(p2.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^�������ˣ��汿��");
				PlayerWinning2 ++; 
				//p1.setWinningTimes(p1.getWinningTimes()+1);
				break;
			case 3:
				System.out.println(p2.getPlayerName() + "��ȭ����\r\n���˵��^_^����Ӯ�ˣ������");
				mySelfWinning ++;
				break;
			} 
		//��ҳ�ȭ-ʯͷ
		}else if (a == 2) {
				System.out.println("���ȭ��ʯͷ");
				switch (p2.getFistKind()) {
				case 1:
					System.out.println(p2.getPlayerName() + "��ȭ������\r\n���˵��^_^����Ӯ�ˣ������");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p2.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^��ƽ�֣�");
					break;
				case 3:
					System.out.println(p2.getPlayerName() + "��ȭ����\r\n���˵��^_^�������ˣ��汿��");
					PlayerWinning2 ++;
					break;
				}
		//��ҳ�ȭ-��
		}else if (a == 3) {
					System.out.println("���ȭ����");
					switch (p2.getFistKind()) {
					case 1:
						System.out.println(p2.getPlayerName() + "��ȭ������\r\n���˵��^_^�������ˣ��汿��");
						PlayerWinning2 ++;
						break;
					case 2:
						System.out.println(p2.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^����Ӯ�ˣ������");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p2.getPlayerName() + "��ȭ����\r\n���˵��^_^��ƽ�֣�");
						break;
					}
		}
	}
	public static void playGame3(){
		PlayerMyself pm = new PlayerMyself();
		System.out.print("���ȭ��1.����  2.ʯͷ  3.�� (������Ӧ����)��");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		Player3 p3 = new Player3();
		p3.inputName();
		p3.myFist();
		//��ҳ�ȭ-����
		if (a == 1) {
			System.out.println("���ȭ������");
			
			switch (p3.getFistKind()) {
			case 1:
				System.out.println(p3.getPlayerName() + "��ȭ������\r\n���˵��^_^��ƽ�֣�");
				break;
			case 2:
				System.out.println(p3.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^�������ˣ��汿��");
				PlayerWinning3 ++; 
				break;
			case 3:
				System.out.println(p3.getPlayerName() + "��ȭ����\r\n���˵��^_^����Ӯ�ˣ������");
				mySelfWinning ++;
				break;
			} 
		//��ҳ�ȭ-ʯͷ
		}else if (a == 2) {
				System.out.println("���ȭ��ʯͷ");
				switch (p3.getFistKind()) {
				case 1:
					System.out.println(p3.getPlayerName() + "��ȭ������\r\n���˵��^_^����Ӯ�ˣ������");
					mySelfWinning ++;
					break;
				case 2:
					System.out.println(p3.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^��ƽ�֣�");
					break;
				case 3:
					System.out.println(p3.getPlayerName() + "��ȭ����\r\n���˵��^_^�������ˣ��汿��");
					PlayerWinning3 ++;
					break;
				}
		//��ҳ�ȭ-��
		}else if (a == 3) {
					System.out.println("���ȭ����");
					switch (p3.getFistKind()) {
					case 1:
						System.out.println(p3.getPlayerName() + "��ȭ������\r\n���˵��^_^�������ˣ��汿��");
						PlayerWinning3 ++;
						break;
					case 2:
						System.out.println(p3.getPlayerName() + "��ȭ��ʯͷ\r\n���˵��^_^����Ӯ�ˣ������");
						mySelfWinning ++;
						break;
					case 3:
						System.out.println(p3.getPlayerName() + "��ȭ����\r\n���˵��^_^��ƽ�֣�");
						break;
					}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*****************");
		System.out.println("***** ��ȭ,��ʼ  ****");
		System.out.println("*****************");
		startGame();
	}
}
