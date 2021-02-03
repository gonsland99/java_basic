package java_basic_code;

import java.util.Scanner;

import java_basic.Random;

public class GababoGame {
	public static void main(String[] args) {
	//com 값 생성
		int menu, com;
		String userStr="";
		String comStr="";
		Random rd = new Random();
		
		com = (int)(Math.random()*3)+1;
		System.out.println(com);
	//user 값 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("------가위,바위,보 게임-------");
		
		do {
			System.out.println("---------------------------");
			System.out.println("아래 메뉴 중 고르세요~");
			System.out.println("----------메 뉴-------------");
			System.out.println("1.가위 2.바위 3.보 4.종료");
			menu = sc.nextInt();
			
			if(menu<0 || menu>4) {
				System.out.println("1~4 중에서 고르세요");
			}else if(menu == 4) {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}while(menu<1 || menu>3);
	//값 비교
		userStr = menu == 1 ? "가위":menu == 2 ? "바위" : "보";
		comStr = com == 1 ? "가위":com == 2 ? "바위" : "보";
		if ((menu == 1 && com == 3) || (menu == 2 && com == 1) || (menu == 3 && com == 2)) {
			System.out.println("승! 유저: " + userStr + ", 컴퓨터: " + comStr);
		} else if (menu == com) {
			System.out.println("무! 유저: " + userStr + ", 컴퓨터: " + comStr);
		} else {
			System.out.println("패! 유저: " + userStr + ", 컴퓨터: " + comStr);
		}
	//결과출력
	}
}
