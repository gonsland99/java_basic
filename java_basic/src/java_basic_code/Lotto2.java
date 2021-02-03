package java_basic_code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		/* 로또 생성기
		 	1. 6개의 랜덤한 수(1~45) 배열에 입력
		 	2. 중복되지 않도록 작성
		*/
		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("로또 생성기");
		System.out.print("몇개를 생성하시겠습니까?: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for(int x=0; x<count; x++) {
			// 로또 생성 시작
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = rd.nextInt(45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
//				System.out.print(lotto[i]+" ");
			}
//			System.out.println();
			//선택정렬 사용 오름차순 정렬
			for(int i=0; i<lotto.length; i++) {
				for(int j=i+1; j<lotto.length; j++) {
					if(lotto[i] > lotto[j]){
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			for(int i= 0; i<lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			} System.out.println();
		//로또 생성 끝
		}
	
	}
}
