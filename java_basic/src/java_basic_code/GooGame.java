package java_basic_code;

import java.util.Scanner;

import java_basic.Random;

public class GooGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, res, user, subscore=0;
		
		System.out.println("---------구구단 게임------------");
		System.out.println("아래 나오는 구구단 답을 입력하세요~!");
		long starttime = System.currentTimeMillis();
		do {
			num1 = (int)(Math.random()*8)+2;
			num2 = (int)(Math.random()*9)+1;
			res = num1 * num2;
			System.out.println(num1+" x "+num2+" = ");
			user = sc.nextInt();
			if(res == user) {
				System.out.println("정답!");
			} else {
				System.out.println("땡! 감점!");
				subscore += 5;
			}
		}while(res != user);
		long endtime = System.currentTimeMillis();
		long playtime = (endtime - starttime) / 1000;
		long score = 110 - playtime - subscore;
		if(score > 100) {
			score = 100;
		} else if(score <0) {
			score = 0;
			System.out.println("사람이 아니군요!");
		}
		System.out.println("소요시간: "+playtime);
		System.out.println("감점: "+subscore);
		System.out.println("최종점수: "+score);
			
	}
}
