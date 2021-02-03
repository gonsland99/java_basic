package java_basic_code;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
	//숫자 생성
		int strike=0, ball=0;
		int[] com = new int[3];
		do {
			com[0] = (int) (Math.random() * 9) + 1;
			com[1] = (int) (Math.random() * 9) + 1;
			com[2] = (int) (Math.random() * 9) + 1;
		} while(com[0] == com[1] || com[1] == com[2] || com[0] == com[2]);
		
		for(int i=0; i<3; i++)
			System.out.print(com[i]);
		System.out.println();
		
	//게임시작
		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		System.out.println("----------야구게임----------");
		do {
		//user 입력값
			System.out.println("---------------------------");
			for(int i=0; i<3; i++) {
				System.out.print((i+1)+"번째 값을 입력하세요(1~9): ");
				user[i] = sc.nextInt();
			}
			System.out.println("---------------------------");
		//strike
			for(int i=0; i<3; i++) {
				if(com[i] == user[i]) {			
					strike++;
				}
			}
		//ball
			if(com[0] == user[1] || com[0] == user[2]) {
				ball++;
			}else if(com[1] == user[0] || com[1] == user[2]) {
				ball++;
			}else if(com[2] == user[0] || com[2] == user[1]) {
				ball++;
			}
			if(strike >2) {
				System.out.println("정답! 게임종료");
				break;
			} else {
				System.out.println(strike + "스트라이크, "+ ball +"볼");
				System.out.println();
			}
			strike=0; ball=0;
			
		} while(com[0]==user[0] || com[1]==user[1] || com[2]==user[2]);

	}
}
